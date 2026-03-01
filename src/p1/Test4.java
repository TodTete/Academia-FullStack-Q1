package p1;

public class Test4 {
    public void sum(int a, int b) {System.out.print(" A");}
    public void sum(int a,float b) {System.out.print(" B");}
    public void sum(float a,double b) {System.out.print(" C");}
    public void sum(double... a) {System.out.print(" D");}
    public static void main(String[] args) {
        Test4 t =  new Test4();
        t.sum(10, 15.25);
        t.sum(10, 24);
        t.sum(10.25,10.25);
    }
}
