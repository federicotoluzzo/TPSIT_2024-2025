package rubrica;

import javax.swing.*;
import java.util.Vector;

public class SearchPanel extends JPanel {
    private SearchBar searchBar;
    private Vector<Contact> results;

    public SearchPanel() {
        searchBar = new SearchBar();
        results = new Vector<>();
        results.add(new Contact("Mauro", "Zane", "014104420", "cipolla@gmail.com"));
        add(searchBar);
    }

    private void setContacts(){
        removeAll();
        for (Contact c : results){
            add(c);
        }
    }
}
