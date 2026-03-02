package p1;

import java.io.*;

public class Product2 implements Serializable {
    private static float averaePrice = 2.99f;
    private String description;
    private transient float price;
    public Product2(String description, float price) {
        this.description = description;
        this.price = price;
    }
    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        price = averaePrice;
    }
    public String toString() {
        return description + " " + price + " " + averaePrice;
    }
}