package notebook;

import java.io.Serializable;

/**
 * Created by cheviuk on 04.09.2015.
 */
public class Note implements Serializable{

    protected String summary = null;
    protected String description = null;

    public Note(String summary, String description) {
        setDescription(description);
        setSummary(summary);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Note() {
        this.description = "";
    }

    public void print(){
        System.out.println("Summary: " + summary);
        System.out.println("Description: " + description);
    }
}
