package notebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by cheviuk on 11.09.2015.
 */
public class NotebookModel implements Serializable {

    private List<Note> notes = new LinkedList<>();

    public NotebookModel() {
        this.notes = new ArrayList<>();
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public void add(Note note){
        this.notes.add(note);
    }

    public void add(Task task){
        this.notes.add(task);
    }

    public void delete(int id){
        this.notes.remove(id);
    }
}
