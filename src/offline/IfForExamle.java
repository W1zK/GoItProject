package offline;

public class IfForExamle {
    public static void main(String[] args) {
      int [] arr = new  int[15];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int)(Math.random()*100-50);

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max < arr[i]) {

                max = arr[i];


            }


        }
        System.out.println("\n" + max);








//        int swap;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <(arr.length - i - 1) ; j++) {
//
//                if (arr[j]>arr[j+1]){
//                    swap=arr[j];
//                    arr[j]= arr[j+1];
//                    arr[j+1]= swap;
//
//                }
//
//            }
//
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length ; i++) {
//
//
//            System.out.print(arr[i]+" ");}
    }

}
