package p1;
class ZeroValueException extends Exception{}
public class main {
    public static void main(String[] args) {
        int a[] = {0,2,4};
        try{
            try {
                if (a[0] == 0) throw new ZeroValueException();
                }catch (ZeroValueException  | NullPointerException zve) {
                throw zve;
                }
            }catch (Exception e){
                System.out.println("Caught " + e);
            }
    }
}