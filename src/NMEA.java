public class NMEA {

    static String GPGSV = "GPGSV,3,1,11,09,76,148,32,05,55,242,30,17,33,054,29,14,27,314,25";
    static String[] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","p","p","q","r","s","t"};

    static void convertMethod (){
        String[] subStr;
        String delimeter = ",";
        subStr = GPGSV.split(delimeter);

        for (int i = 0; i < GPGSV.length() ; i++) {

            subStr[i] = letter[i];

            System.out.println(letter[i]);


        }
        System.out.println();

//        String type = subStr[0];
//        int quantity = Integer.valueOf(subStr[1]);
//        int z = Integer.valueOf(subStr[2]);
//        int x = Integer.valueOf(subStr[3]);
//        int c = Integer.valueOf(subStr[4]);
//        int v = Integer.valueOf(subStr[5]);
//        int b = Integer.valueOf(subStr[6]);
//        int n = Integer.valueOf(subStr[7]);
//        int m = Integer.valueOf(subStr[8]);
//        int a = Integer.valueOf(subStr[9]);
//        int s = Integer.valueOf(subStr[10]);
//        int d = Integer.valueOf(subStr[11]);
//        int f = Integer.valueOf(subStr[12]);
//        int g = Integer.valueOf(subStr[13]);
//        int h = Integer.valueOf(subStr[14]);
//        int j = Integer.valueOf(subStr[15]);
//        int k = Integer.valueOf(subStr[16]);
//        int l = Integer.valueOf(subStr[17]);
//        int q = Integer.valueOf(subStr[18]);
//        int w = Integer.valueOf(subStr[18]);
//
//        for (int i = 0; i < subStr.length ; i++) {
//            System.out.println(subStr[i]);
//
//        }

//        long con = Long.parseLong(s[1]);
//        System.out.println(type + "\n" +
//                "Integer:"+ String.valueOf(quantity) + "\n" +
//                "Integer:"+ String.valueOf(z) + "\n" +
//                "Integer:"+ String.valueOf(x) + "\n" +
//                "Integer:"+ String.valueOf(c) + "\n" +
//                "Integer:"+ String.valueOf(v) + "\n" +
//                "Integer:"+ String.valueOf(b) + "\n" +
//                "Integer:"+ String.valueOf(n) + "\n" +
//                "Integer:"+ String.valueOf(m) + "\n" +
//                "Integer:"+ String.valueOf(a) + "\n" +
//                "Integer:"+ String.valueOf(s) + "\n" +
//                "Integer:"+ String.valueOf(d) + "\n" +
//                "Integer:"+ String.valueOf(f) + "\n" +
//                "Integer:"+ String.valueOf(g) + "\n" +
//                "Integer:"+ String.valueOf(h) + "\n" +
//                "Integer:"+ String.valueOf(j) + "\n" +
//                "Integer:"+ String.valueOf(k) + "\n" +
//                "Integer:"+ String.valueOf(l) + "\n" +
//                "Integer:"+ String.valueOf(q) + "\n" +
//                "Integer:"+ String.valueOf(w));





    }

    public static void main(String[] args) {
        convertMethod();




    }
}