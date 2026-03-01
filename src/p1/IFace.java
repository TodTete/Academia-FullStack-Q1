package p1;

public interface IFace {
    public void m1();
    public default void m2(){System.out.println("m2");}
    public static void m3() {System.out.println("m3");}
    private void m4() {System.out.println("m4");}
}
class MyC implements IFace {
    public void m1() {System.out.println("Hello");}}
class tod {
    public static void main(String[] args) {
        IFace.m3();
        new MyC().m2();
    }
}