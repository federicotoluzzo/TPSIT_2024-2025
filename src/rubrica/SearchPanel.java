package rubrica;

import javax.swing.*;
import java.util.Vector;

public class SearchPanel extends JPanel {
    private SearchBar searchBar;

    private Vector<Contact> contacts;

    private Contacts main;

    public SearchPanel(Contacts main) {
        this.main = main;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        searchBar = new SearchBar(main);
        contacts = new Vector<>();
        contacts.add(new Contact(main,"Zauro", "Mane", "014104420", "cipolla@gmail.com"));
        add(searchBar);
        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 100, 100);
        add(panel);
        setContacts(contacts);
    }

    private void setContacts(Vector<Contact> contacts){
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
    }
}
