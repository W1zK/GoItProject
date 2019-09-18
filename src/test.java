//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class test {
//    public static void main(String[] args) {
//        String sTime;
//        String subbStr;
//        String[] subStr;
//
//
//        String pool = "235,230546";
//        String delimeter = ",";
//        subStr = pool.split(delimeter);
//        subStr[1]= subStr[1].replaceAll("(.{2})", "$0 ");
//        String[] result = subStr[1].split(" ");
//        int day = result[0].equals("") ? 0 : Integer.valueOf(result[0]);
//        int month = result[1].equals("") ? 0 : Integer.valueOf(result[1]);
//        int year = result[2].equals("") ? 0 : Integer.valueOf(result[2]);
//        System.out.println("Время статус положения: " + day+":"+month+":"+year);
//    }
////    static String date1Format(int index){
////
//////        subStr[index]= subStr[index].replaceAll("(.{2})",);
//////        String[] result = subStr[index].split("-");
////        int day = Integer.valueOf(subStr[index].substring(0,2));
////        int month = Integer.valueOf(subStr[index].substring(2,4));
////        int year = Integer.valueOf(subStr[index].substring(4,6));
//////        int year = result[2].equals("") ? 0 : Integer.valueOf(result[2]);
////        return day +"-"+ month +"-"+ year;
////
////
////    }
//static Date dateFormat(String s) {
//    Date date= null;
//    try {
//        date = new SimpleDateFormat("ddMMyy").parse(s);
//    } catch (ParseException e) {
//        e.printStackTrace();
//    }
//    String newDate=new SimpleDateFormat("dd-MM-yy").format(date);
//
//    return date;
//}
//}
