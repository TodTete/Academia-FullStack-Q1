package p1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class file {
    public static void main(String[] args) {
        Path p1 = Paths.get("fldr1\\fldr2\\file1.txt");
        Path p2 = Paths.get("fldr3\\file1.txt");
        System.out.println(p1.resolve(p2));
        System.out.println(p1.relativize(p2));
    }
}
