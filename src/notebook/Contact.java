
package notebook;

import java.io.Serializable;

/**
 * Created by cheviuk on 04.09.2015.
 * cheviuknotebook
 * ${PACKAGE_NAME}
 */
public class Contact implements Serializable {
    private String name = null;
    private String email = null;
    private String phone = null;

    /**
     *
     * @param name
     * @param email
     * @param phone
     */
    public Contact(final String name, final String email, final String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    /**
     * print info
     */
    public void print() {
        System.out.println("Name: " + name + " email: " + email + " phone: " + phone);
    }
}
