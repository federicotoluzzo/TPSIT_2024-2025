package cinzia.products;

import javax.swing.*;

public class ChickenSandwich extends Product {


    public ChickenSandwich(variations variation) {
        super("Chicken Sandwich", 3.00, 10, new ImageIcon("hq720.jpg"));
        this.variation = variation;


        infoPanel.add(new JComboBox<String>())
    }

    private variations variation;

    @Override
    public String toJSONString(){
        String json = super.toJSONString();
        json = json.substring(0, json.length()-2);
        json += ",\" variation\"" + variation.toString() + "}";

        return json;
    }

    public enum variations{
        NO_KETCHUP{
            @Override
            public String toString() {
                return "no ketchup";
            }
        },
        NO_MAYO{
            @Override
            public String toString() {
                return "no mayonnaise";
            }
        },
        NO_LETTUCE{
            @Override
            public String toString() {
                return "no lettuce";
            }
        },
        NO_TOMATOES{
            @Override
            public String toString() {
                return "no tomatoes";
            }
        },
        NO_SAUCE{
            @Override
            public String toString() {
                return "no sauces";
            }
        },
        NO_VEGGIES{
            @Override
            public String toString() {
                return "no vegetables";
            }
        }
    }
}
