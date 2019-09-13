package offline;

public class Calendar {
    static String[] pool = { "monday", "thursday", "wednesday", "thursday", "friday", "saturday","sunday"};


    public static void main(String[] args) {
        int day = 9;
        int x = day%7;
        if(x == 0){
            System.out.println("monday");
        }else if(x==1){
            System.out.println("thursday");
        }else if (x==2){
            System.out.println("wednesday");
        } else if (x==3){
            System.out.println("thursday");
        } else if (x==4){
            System.out.println("friday");
        } else if (x==5){
            System.out.println("saturday");
        } else if (x==6){
            System.out.println("sunday");
        }




        System.out.println(pool[day%7]);

    }
}
