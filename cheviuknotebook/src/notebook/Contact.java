package notebook;

import java.io.Serializable;

/**
 * Created by cheviuk on 04.09.2015.
 */
public class Contact implements Serializable {
    private String name = null;
    private String email = null;
    private String phone = null;

    public Contact() {
        this.name = "";
        this.email = "";
        this.phone = "";

    }

    public Contact(String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;

    }

    public void print(){
        System.out.println("Name: " + name + " email: " + email + " phone: " + phone);
    }
}
