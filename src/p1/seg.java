package p1;

public class seg {
    public static void main(String[] args) {
        String a = "Hello! Java";
        System.out.print(a.indexOf("Java"));
        a.replace("Hello!", "Welcome!");
        System.out.print(a.indexOf("Java"));
        StringBuilder b = new StringBuilder(a);
        System.out.print(b.indexOf("Java"));
    }
}
