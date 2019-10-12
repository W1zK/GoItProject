package offline.nasledovanie;

public class Cat extends Animal1 {
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
}
