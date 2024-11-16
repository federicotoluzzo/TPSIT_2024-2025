package cinzia;

import cinzia.products.ChickenSandwich;

import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) {
        App app = new App();
        app.setContentPane(new ChickenSandwich(ChickenSandwich.variations.NO_MAYO));
        app.setVisible(true);
    }
}
