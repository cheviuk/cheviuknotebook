package notebook;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cheviuk on 11.09.2015.
 * cheviuknotebook
 * ${PACKAGE_NAME}
 */
public class NotebookController {

    private NotebookModel notebookModel = null;

    public NotebookController(NotebookModel notebookModel){
        this.notebookModel = notebookModel;
    }

    public List<Note> getNotes() {

        return notebookModel.getNotes();
    }

    public void add(String summary, String description){
        Note note = new Note(summary, description);
        notebookModel.add(note);
    }

    public void add(String summary, String description, Date dueDate){
        Task task = new Task(summary, description, dueDate);
        notebookModel.add(task);
    }

    public void add(String summary, String description, String place, Date startTime, Date endTime
                    , List<Contact> contacts){
        Meeting meeting = new Meeting(summary, description, place, startTime, endTime, contacts);
        notebookModel.add(meeting);
    }

    public void delete(int id){
        notebookModel.delete(id);
    }

    public void saveToFile() throws IOException {
        FileOutputStream fout = new FileOutputStream(Paths.get("").toAbsolutePath().toString() + "\\notebook.ser", false);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(notebookModel);
        System.out.println("Notebook saved to: " + Paths.get("").toAbsolutePath().toString() + "\\notebook.ser");
        oos.close();
        fout.close();
    }

    public void loadFromFile() throws  IOException, ClassNotFoundException {

        List<Object> objects = new ArrayList<>();
        FileInputStream fis = new FileInputStream(Paths.get("").toAbsolutePath().toString() + "\\notebook.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        objects.add(ois.readObject());
        ois.close();
        fis.close();

        NotebookModel loadedNotebook = (NotebookModel)objects.get(0);
        this.notebookModel.setNotes(loadedNotebook.getNotes());
    }

    public Contact createContact(String name, String email, String phone){
        return new Contact(name, email, phone);
    }
}
