package rubrica;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class Contact{
    public String surname;
    public String name;
    public String phoneNumber;
    public String email;

    private Contacts main;

    public Contact(Contacts main, String surname, String name, String phoneNumber, String email) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setContact(Contact contact) {
        main.setContact(contact);
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %s", surname, name, phoneNumber, email);
    }
}
