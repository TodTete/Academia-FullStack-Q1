package p1;

public class Test3 {
    static interface Animmal{}
    static class Dog implements Animmal{}
    private static void play(Animmal a){System.out.println("flips");}
    private static void play(Dog d){System.out.println("runs");}
    public static void main(String[] args) {
        Animmal a1 = new Dog();
        Dog a2 = new Dog();
        play(a1);
        play(a2);
    }
}
