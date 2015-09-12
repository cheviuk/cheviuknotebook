package notebook;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by cheviuk on 04.09.2015.
 */
public class Meeting extends Note implements Serializable{
    private Date startTime = null;
    private Date endTime = null;
    private String place = null;
    List<Contact> contacts = null;

   public Meeting(){
       Calendar c = Calendar.getInstance();
       c.setTimeInMillis(startTime.getTime());
       this.startTime = c.getTime();
       c.add(Calendar.HOUR, 1);
       this.endTime = c.getTime();
       this.place = "";
       this.contacts = new LinkedList<Contact>();
   }

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
        String startTime = "";
        String endTime = "";
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
