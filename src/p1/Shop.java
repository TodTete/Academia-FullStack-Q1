package p1;

import java.io.*;

public class Shop {
    public static void main(String[] args) {
        Product2 p = new Product2("Cookie", 3.99f);
        try{
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("p.ser"))) {
                out.writeObject(p);
            }
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("p.ser"))) {
                p =(Product2)in.readObject();
            }
        } catch (Exception e) { e.printStackTrace(); }
        System.out.println(p);
    }
}
