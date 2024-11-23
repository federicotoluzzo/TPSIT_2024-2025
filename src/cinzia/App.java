package cinzia;

import cinzia.products.Product;
import cinzia.products.ProductPanel;

import javax.swing.*;
import java.util.Vector;

public class App extends JFrame {
    Vector<Product> products = new Vector<>();

    public static void main(String[] args) {
        App app = new App();
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
        app.getContentPane().add(new Menu());
        app.setVisible(true);

        app.pack();
    }

    private void setProducts() {
        products.add(new Product("Chicken sandwich", 3.00f, "halal chicken protein sandwich panino cotoletta pollo", "/assets/cinzia/chicken_sandwich.png"));
        products.add(new Product("Tea", 1.60f, "drink refreshing tea dissetante sweet dolce", "/assets/cinzia/tea.png"));
        products.add(new Product("Pizza", 2.50f, "pizza pizzetta", "/assets/cinzia/pizza.png"));
        products.add(new Product("Sandwich", 2.60f, "panino sandwich genovese porchetta salsa messicana psm", "/assets/cinzia/sandwich.png"));
        products.add(new Product("Biscuit", 1.50f, "sweet biscuit biscotto dolce dolcetto ", "/assets/cinzia/biscuit.png"));
        products.add(new Product("Soda", 1.20f, "sweet refreshing soda pop gassata bevanda beverage dolce", "/assets/cinzia/soda.png"));
    }

    private void addProducts(){
        for(Product p : products){
            add(new ProductPanel(p));
        }
    }
}
