package offline.nasledovanie;

class Animal1 {
    private String name;
    public int age;
    {
        System.out.println("block");
    }
    static {
        System.out.println("static block");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void show(){
        System.out.print("asd");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
