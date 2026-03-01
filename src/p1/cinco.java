package p1;

public class cinco {
    public static void main(String[] args) {
        Pet p = new Pet("Dog");
        Pet p1 = p;
        p1.name = "Cat";
        p = p1;
        System.out.println(p.name);
        p = null;
        System.out.println(p1.name);
    }

    static class Pet {
        String name;
        public Pet(String name) {
            name = this.name;;
        }
    }
}
