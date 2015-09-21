package notebook;

import java.io.Serializable;

/**
 * Created by cheviuk on 04.09.2015.
 * cheviuknotebook
 * ${PACKAGE_NAME}
 */
class Note implements Serializable{

    String summary = null;
    String description = null;

    public Note(String summary, String description){
        setDescription(description);
        setSummary(summary);
    }

    public String getSummary() {
        return summary;
    }

    void setSummary(String summary) {
        this.summary = summary;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    Note() {
        this.description = "";
    }

    public void print(){
        System.out.println("Summary: " + summary);
        System.out.println("Description: " + description);
    }
}
