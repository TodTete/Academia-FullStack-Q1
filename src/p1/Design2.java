package p1;

public enum Design2 {
        CEO('A'), CMO('B'), CTO('C'), CFO('D');
        char c;
        private Design2(char c) {
    this.c = c;
}
}

class ed2 {
    public static void main(String[] args) {
        System.out.println(Design2.valueOf("CMO"));
        System.out.println(Design2.values()[0].name());
    }
}