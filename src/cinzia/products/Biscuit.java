package cinzia.products;

import javax.swing.*;

public class Biscuit extends Product{
    public Biscuit() {
        super("Biscuit", 1.20, 50, new ImageIcon("Biscuit.png"));
        ImageIcon image = new ImageIcon("Biscuit.png");
    }

    enum variations{
        CHOCOLATE_DIPPED{
            public String toString() {
                return "Chocolate dipped";
            }
        },
        VANILLA{
            public String toString() {
                return "Vanilla";
            }
        }
    }
}
