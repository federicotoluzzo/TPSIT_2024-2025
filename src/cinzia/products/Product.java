package cinzia.products;

import javax.swing.*;
import java.awt.*;

abstract public class Product extends JPanel {
    protected JLabel productName;
    protected JLabel price;
    protected JLabel image;
    protected JSpinner count;
    protected int inventory;
    protected JPanel infoPanel;

    public Product(String productName, double price, int inventory, ImageIcon image) {
        this.productName = new JLabel(productName);
        this.price = new JLabel(String.valueOf(price) + "€");
        this.image = new JLabel(image);
        this.inventory = inventory;
        count = new JSpinner();
        count.setPreferredSize(new Dimension(20, 20));
        count.setModel(new SpinnerNumberModel(0, 0, inventory, 1));

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        add(this.image);

        infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.add(this.productName);
        infoPanel.add(this.price);
        infoPanel.add(this.count);

        add(infoPanel);
    }

    public String toJSONString() {
        String JSONString = "{";
        JSONString += "\"productName\":\"" + productName + "\",";
        JSONString += "\"count\":" + count + ",";
        JSONString += "}";
        return JSONString;
    }
}
