package notebook;

/**
 * Created by cheviuk on 11.09.2015.
 */
public class NotebookController {

    NoteModel notes = null;

    public NoteModel getNotes() {
        return notes;
    }

    public void setNotes(NoteModel notes) {
        this.notes = notes;
    }

    public void add(String summary, String description){
        Note note = new Note(summary, description);
        notes.add(note);
    }

    public void add(String summary, String description, Date dueDate){
        Task task = new Task(summary, description, dueDate);
        notes.add(task);
    }

    public void add(String summary, String description, String place, Date startTime, Date endTime,
                    List<Contacts> contacts) {
        Meeting meeting = new Meeting(summary, description, place, startTime, endTime, contacts);
        notes.add(meeting);
    }

    public void delete(int id){

    }

}
