package rubrica;

import javax.swing.*;

public class MainPanel extends JPanel {
    private SearchPanel searchPanel;
    private EditPanel editPanel;

    public MainPanel(Contacts main) {
        searchPanel = new SearchPanel(main);
        editPanel = new EditPanel(main);

        add(searchPanel);
        add(editPanel);
    }
}
