package rubrica;

import javax.swing.*;
import java.util.Vector;

public class SearchPanel extends JPanel {
    private SearchBar searchBar;

    private Vector<Contact> results;

    private Contacts main;

    public SearchPanel(Contacts main) {
        this.main = main;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        searchBar = new SearchBar();
        results = new Vector<>();
        results.add(new Contact(main,"Zauro", "Mane", "014104420", "cipolla@gmail.com"));
        add(searchBar);
        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 100, 100);
        add(panel);
        setContacts();
    }

    private void setContacts(){
        removeAll();
        add(searchBar);
        for (Contact c : results){
            add(c);
        }
    }

    public void addContact(Contact contact){
        for (int i = 0; i < results.size(); i++){
            if (results.get(i).name.equals(contact.name) && results.get(i).surname.equals(contact.surname)){
                results.set(i, contact);
                setContacts();
                return;
            }
        }
        results.add(contact);
        setContacts();
    }
}
