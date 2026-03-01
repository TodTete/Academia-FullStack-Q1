package p1;

public class siete {
    public static void main(String[] args) {
        int newE, e = 4;
        newE = switch (e){
            case 1,2 -> e+5;
            case 3,4 -> e+3;
            case 5,6 -> e+1;
            default -> 0;};
        System.out.println(newE);
    }
}
