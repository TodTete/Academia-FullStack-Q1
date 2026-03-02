package p1;

import java.io.*;

public class AppStore{
    public static void main(String[] args) {
        Software s = new Game("Chess", 2);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("game.ser"))) {
            out.writeObject(s);
        } catch (Exception e){
            System.out.println("write error");
        }
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("game.ser"))){
            s = (Software)in.readObject();
        }catch (Exception e){
            System.out.println("read error");
        }
        System.out.println(s);
    }
}
