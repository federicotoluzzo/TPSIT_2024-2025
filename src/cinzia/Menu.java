package cinzia;

import cinzia.products.ProductPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Menu extends JScrollPane {
    private Vector<ProductPanel> menu = new Vector<>();
    private JPanel panel;

    public Menu() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        setPreferredSize(new Dimension(500, 500));
        setSize(new Dimension(500, 500));

        setViewportView(panel);
    }

    public void add(ProductPanel c){
        menu.add(c);
        panel.add(c);
    }
}
