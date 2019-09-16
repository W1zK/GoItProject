import java.util.Scanner;

public class NMEA {

    static String GPGSV = "$GPGSV,3,1,11,09,76,148,32,8,,242,30,17,33,054,29,14,27,314,25*47";
    static String GNGLL = "$GPGLL,4915.3920,N,12259.8072,W,222414,A*79";
    static String[] subStr;

    static void circumcision(String name){
        String delimeter = ",";
        subStr = name.split(delimeter);
        subStr[0] = subStr[0].substring(1);
        subStr[subStr.length - 1] = subStr[subStr.length - 1].substring(0, subStr[subStr.length - 1].indexOf("*"));
    }

    static void gpgsvMethod(){

        circumcision(GPGSV);

        String type = subStr[0];
        int qMassage = subStr[1].equals("") ? 0 : Integer.valueOf(subStr[1]); //quantity massage
        int numMassage = subStr[2].equals("") ? 0 : Integer.valueOf(subStr[2]); // number massage
        int qSat = subStr[3].equals("") ? 0 : Integer.valueOf(subStr[3]); //quantity satellite
        int satId = subStr[4].equals("") ? 0 : Integer.valueOf(subStr[4]); //number satellite
        int elevation = subStr[5].equals("") ? 0 : Integer.valueOf(subStr[5]); //elevation angle
        int azimuth = subStr[6].equals("") ? 0 : Integer.valueOf(subStr[6]); //azimuth
        int snr = subStr[7].equals("") ? 0 : Integer.valueOf(subStr[7]); //signal strength
        int satId1 = subStr[8].equals("") ? 0 : Integer.valueOf(subStr[8]); //number satellite
        int elevation1 = subStr[9].equals("") ? 0 : Integer.valueOf(subStr[9]); //elevation angle
        int azimuth1 = subStr[10].equals("") ? 0 : Integer.valueOf(subStr[10]); //azimuth
        int snr1 = subStr[11].equals("") ? 0 : Integer.valueOf(subStr[11]); //signal strength
        int satId2 = subStr[12].equals("") ? 0 : Integer.valueOf(subStr[12]);
        int elevation2 = subStr[13].equals("") ? 0 : Integer.valueOf(subStr[13]);
        int azimuth2 = subStr[14].equals("") ? 0 : Integer.valueOf(subStr[14]);
        int snr2 = subStr[15].equals("") ? 0 : Integer.valueOf(subStr[15]);
        int satId3 = subStr[16].equals("") ? 0 : Integer.valueOf(subStr[16]);
        int elevation3 = subStr[17].equals("") ? 0 : Integer.valueOf(subStr[17]);
        int azimuth3 = subStr[18].equals("") ? 0 : Integer.valueOf(subStr[18]);
        int snr3 = subStr[19].equals("") ? 0 : Integer.valueOf(subStr[19]);

        System.out.println("Type of massage(String):" + type + "\n" +
                            "Quantity massage(Integer):"+ qMassage + "\n" +
                            "Number of massage(Integer):"+ numMassage + "\n" +
                            "Quantity satellite(Integer):"+ qSat + "\n" +
                            "-----------------------------" + "\n" +
                            "Number satellite(Integer):"+ satId + "\n" +
                            "Elevation angle(Integer):"+ elevation + "\n" +
                            "Azimuth(Integer):"+ azimuth + "\n" +
                            "Signal strength(Integer):"+ snr + "\n" +
                            "-----------------------------" + "\n" +
                            "Number satellite(Integer):"+ satId1 + "\n" +
                            "Elevation angle(Integer):"+ elevation1 + "\n" +
                            "Azimuth(Integer):"+ azimuth1 + "\n" +
                            "Signal strength(Integer):"+ snr1 + "\n" +
                            "-----------------------------" + "\n" +
                            "Number satellite(Integer):"+ satId2 + "\n" +
                            "Elevation angle(Integer):"+ elevation2 + "\n" +
                            "Azimuth(Integer):"+ azimuth2 + "\n" +
                            "Signal strength(Integer):"+ snr2 + "\n" +
                            "-----------------------------" + "\n" +
                            "Number satellite(Integer):"+ satId3 + "\n" +
                            "Elevation angle(Integer):"+ elevation3 + "\n" +
                            "Azimuth(Integer):"+ azimuth3 + "\n" +
                            "Signal strength(Integer):"+ snr3);





    }

//    static void glgsvMethod(){}

    static void gngllMethod(){
        circumcision(GNGLL);
        String type = subStr[0];
        double latitude = subStr[1].equals("") ? 0 : Double.valueOf(subStr[1]); //latitude
        char dir = subStr[2].equals("")?'-':subStr[2].charAt(0);
        double longitude = subStr[3].equals("") ? 0 : Double.valueOf(subStr[3]); //longitude
        char dir1 = subStr[4].equals("")?'-':subStr[4].charAt(0);
        long time = subStr[5].equals("")?0:Long.valueOf(subStr[5]);
        char dataType = subStr[6].equals("")?'-':subStr[6].charAt(0);

        System.out.println("Type of massage(String):" + type + "\n" +
                            "Latitude(double,char):" + latitude + "," + dir + "\n" +
                            "Longitude(double,char):" + longitude + "," + dir1 + "\n" +
                            "Time registration hhmmss(long):" + time + "\n" +
                            "Valid data(char):" + dataType);



    }



    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        switch (x){
            case 1: gpgsvMethod();
            break;
            case 2: gngllMethod();
            break;

            default:
                System.out.println("You type wrong number");
        }







    }
}