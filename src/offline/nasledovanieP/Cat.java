package offline.nasledovanieP;

public class Cat extends Animal {
    public Cat(String yog, int i) {
        super(yog,i);
        //super.setName(yog);
        //super.setAge(i);
    }

    static void show2(){
        System.out.println("show2");
    }

    @Override
    public String getName() {
        return "fonka";
    }

    @Override
    public int getAge() {
        return 5;
    }
}
