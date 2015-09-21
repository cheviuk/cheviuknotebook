package notebook;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by cheviuk on 04.09.2015.
 * cheviuknotebook
 * ${PACKAGE_NAME}
 */
public class Meeting extends Note implements Serializable {
    private Date startTime = null;
    private Date endTime = null;
    private String place = null;
    private List<Contact> contacts = null;

    public Meeting(String summary, String description, String place, Date startTime, Date endTime
                   , List<Contact> contacts) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.place = place;
        this.contacts = contacts;
        this.summary = summary;
        this.description = description;

    }

    @Override
    public String getSummary(){
        return this.summary;
    }

    @Override
    public void setSummary(String summary){
        this.summary = summary;
    }

    public void print(){
        String startTime;
        String endTime;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        startTime = sdf.format(this.startTime);
        endTime = sdf.format(this.endTime);
        System.out.println("Summary: " + summary);
        System.out.println("Description: " + description);
        System.out.println("Start time: " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println("Place: " + place);
        System.out.println("Contacts: ");
        for(Contact contact : contacts){
            contact.print();
        }

    }
}
