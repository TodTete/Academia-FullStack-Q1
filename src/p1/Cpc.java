package p1;

public class Cpc {
    public static void main(String[] args) {
        String myStr = "Hello Java 17";
        String myTextBlk1 = """
                            Hello Java 17""";
        String myTextBlk2 = """
                            Hello Java 17
                            """;
        System.out.print(myStr.equals(myTextBlk1)+":");
        System.out.print(myStr.equals(myTextBlk2)+":");
        System.out.print(myTextBlk1.equals(myTextBlk2)+":");
        System.out.print(myTextBlk1.intern() == myTextBlk2.intern());
    }
}
