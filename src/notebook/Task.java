package notebook;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cheviuk on 04.09.2015.
 * cheviuknotebook
 * ${PACKAGE_NAME}
 */
public class Task extends Note implements Serializable {
    private Date dueDate = null;

    public Task(String summary, String description, Date dueDate){
        super(summary, description);
        this.dueDate = dueDate;
    }

    @Override
    public String getSummary(){
        return this.summary;
    }

    @Override
    public void setSummary(String summary){
        this.summary = summary;
    }

    @Override
    public void print(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = sdf.format(this.dueDate);
        System.out.println("Summary: " + summary);
        System.out.println("Description: " + description);
        System.out.println("Due Date: " + dueDate);
    }

}
