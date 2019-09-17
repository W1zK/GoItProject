package offline.sourve;

public class factorial {

    public static void main(String[] args) {
//        int fact = 1;
//        for (int i = 0; i <= 5 ; i++) {
//
//            fact *= i==0?1:i;
//
//
//        }
//        System.out.println(fact);


        System.out.println(factorial(5));
    }

    static int factorial(int data){
        if (data == 0){
            return 1;
        }

        return data*(data==0?1:factorial(data -1));

    }
}
