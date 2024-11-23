package cinzia.products;

import javax.swing.*;
import java.awt.*;

public class ProductPanel extends JPanel {
    Product product;

    private JLabel nameLabel;
    private JLabel priceLabel;
    private JSpinner quantitySpinner;
    private JLabel imageLabel;

    public ProductPanel(Product product) {
        this.product = product;
        this.nameLabel = new JLabel(product.getName());
        this.priceLabel = new JLabel(product.getPrice() + "€");
        this.quantitySpinner = new JSpinner();
        this.imageLabel = new JLabel(new ImageIcon(product.getImageUrl()));

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        add(imageLabel);
        add(nameLabel);
        add(priceLabel);
        add(quantitySpinner);
    }
}
