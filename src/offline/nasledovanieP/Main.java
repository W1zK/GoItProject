package offline.nasledovanieP;

public class Main {
    public static void main(String[] args) {
        MakeNoize[] noizes = new MakeNoize[4];
        noizes[0] = new Cat("kot1",1);
        noizes[1] = new Car();
        noizes[2] = new Animal("animal",5);
        noizes[3] = new Dog("dog",5);

        for (int i = 0; i < noizes.length; i++) {
            noizes[i].toNoize();
            //System.out.println(noizes[i].getName());
        }
    }
}
