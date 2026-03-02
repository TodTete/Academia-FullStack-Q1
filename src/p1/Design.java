package p1;

import java.util.Arrays;

public enum Design {
    CEO('A'), CMO('B'), CTO('C'), CFO('D');
    char c;
    private Design(char c) {
        this.c = c;
    }
}
class ed {
    public static void main(String[] args) {
        Arrays.stream(Design.values()).dropWhile(s -> s.equals(Design.CMO));
        switch (Design.valueOf("CMO")) {
            case CEO -> System.out.println("Executive");
            case CMO -> System.out.println("Marketing");
            case CFO -> System.out.println("Finance");
            case CTO -> System.out.println("Technical");
            default -> System.out.println("UnDefined");
        }
    }
}