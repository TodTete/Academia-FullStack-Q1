package p1;
public abstract class Sport {
    public void play(){System.out.println("a ");};
}
class InDoor extends Sport{
    public void play() {
        super.play();
        System.out.println("b ");
    }
}
class Badminton extends InDoor{
    public void play() {
        super.play();
        System.out.println("c ");
    }
}
class test{
    public static void main(String[] args) {
        Sport s1 = new Badminton();
        InDoor s2 = new Badminton();
        Badminton s3 = new Badminton();
        s1.play();
        s2.play();
        s3.play();
    }
}