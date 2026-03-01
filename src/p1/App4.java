package p1;


public class App4{
    public static void main(String[] args) {
        Doc ts = new Doc("Sales");
        ts.printDoc();
        Doc ts1 = new Doc("Purchase");
        ts1.printDoc();}}
class Doc {
    public static Integer dId = 100;
    String name;
    Doc(String n){
        this.dId = ++dId;
        this.name = n;}
    public void printDoc(){
        System.out.println(name + " - "+ dId + " is printed.");}
}
