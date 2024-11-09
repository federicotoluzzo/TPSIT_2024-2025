package rubrica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

public class SearchPanel extends JPanel {
    private SearchBar searchBar;

    private Vector<Contact> contacts;
    private JList<Contact> results;

    private Contacts main;

    public SearchPanel(Contacts main) {
        this.main = main;
        results = new JList<>();
        contacts = new Vector<>();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        searchBar = new SearchBar(main);
        add(searchBar);
        JScrollPane scrollPane = new JScrollPane(results);
        add(scrollPane);
        results.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2) {
                    main.setContact(results.getSelectedValue());
                }
            }
        });
        setContacts(contacts);
    }

    private void setContacts(Vector<Contact> contacts) {
        //removeAll();
        //add(searchBar);
        results.setListData(contacts);
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).name.equals(contact.name) && contacts.get(i).surname.equals(contact.surname)){
                contacts.set(i, contact);
                setContacts(contacts);
                return;
            }
        }
        contacts.add(contact);
        setContacts(contacts);
    }

    public void searchContact(String query) {
        Vector<Contact> results = new Vector<>();
        for (Contact c : contacts){
            if (c.toString().contains(query)){
                results.add(c);
            }
        }
        setContacts(results);
    }

    public void saveContacts(){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("contacts.csv");
            for (Contact c : contacts){
                pw.println(c.toString());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /*private void setContacts(Vector<Contact> contacts){
        removeAll();
        add(searchBar);
        for (Contact c : contacts){
            add(c);
        }
    }

    public void addContact(Contact contact){
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).name.equals(contact.name) && contacts.get(i).surname.equals(contact.surname)){
                contacts.set(i, contact);
                setContacts(contacts);
                return;
            }
        }
        contacts.add(contact);
        setContacts(contacts);
    }
    
    public void searchContact(String query){
        Vector<Contact> results = new Vector<>();
        for (Contact c : contacts){
            if (c.name.toLowerCase().contains(query.toLowerCase()) || c.surname.toLowerCase().contains(query.toLowerCase()) || c.phoneNumber.contains(query) || c.email.toLowerCase().contains(query.toLowerCase())){
                results.add(c);
            }
        }
        setContacts(results);
    }*/
}
