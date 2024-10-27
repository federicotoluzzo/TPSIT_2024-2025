package rubrica;

import javax.swing.*;
import java.awt.*;

public class Contacts extends JFrame {

    public static void main(String[] args) {
        Contacts c = new Contacts();
    }

    private MainPanel mainPanel;
    private ButtonMenu buttonMenu;

    public Contacts() {
        super("Contacts");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        mainPanel = new MainPanel(this);
        buttonMenu = new ButtonMenu(this);

        getContentPane().add(mainPanel);
        getContentPane().add(buttonMenu);

        pack();

        setVisible(true);
    }

    public void saveContact(){
        mainPanel.searchPanel.addContact(mainPanel.editPanel.getContact());
        pack();
    }

    public void setContact(Contact c){
        mainPanel.editPanel.setContact(c);
    }

    public void searchContact(String query){
        mainPanel.searchPanel.searchContact(query);
    }
}
