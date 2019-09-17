import java.util.Scanner;

public class NMEA {

    static String GPGSV = "$GPGSV,5,3,12,02,52,128,20,01,48,240,30,03,33,054,29,14,27,314,25*47";
    static String GLGSV = "$GLGSV,3,1,11,04,76,148,32,02,62,242,35,01,27,067,35,,,,*47";
    static String GNGLL = "$GPGLL,4915.3920,N,12259.8072,W,222414.00,A*79";
    static String GNRMC = "$GNRMC,165111.98,A,5601.0318,N,01211.3503,E,0.08,43.53,190706,,*3E";
    static String GNVTG = "$GNVTG,30.60,T,,M,0.10,N,0.2,K,D*56";
    static String GNGGA = "$GPGGA,165116.000,5601.0318,N,01211.3504,E,1,07,1.2,22.8,M,41.6,M,2,5438*6E";
    static String GNGSA = "$GNGSA,M,3,17,02,30,04,05,10,09,06,31,12,,,1.2,0.8,0.9*2B";
    static String[] subStr;

    static void circumcision(String name) {
        String delimeter = ",";
        subStr = name.split(delimeter);
        subStr[0] = subStr[0].substring(1);
        subStr[subStr.length - 1] = subStr[subStr.length - 1].substring(0, subStr[subStr.length - 1].indexOf("*"));
    }

    static void gpgsvMethod() {

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
                "Quantity massage(int):" + qMassage + "\n" +
                "Number of massage(int):" + numMassage + "\n" +
                "Quantity satellite(int):" + qSat + "\n" +
                "-----------------------------" + "\n" +
                "Number satellite(int):" + satId + "\n" +
                "Elevation angle(int):" + elevation + "\n" +
                "Azimuth(int):" + azimuth + "\n" +
                "Signal strength(int):" + snr + "\n" +
                "-----------------------------" + "\n" +
                "Number satellite(int):" + satId1 + "\n" +
                "Elevation angle(int):" + elevation1 + "\n" +
                "Azimuth(Integer):" + azimuth1 + "\n" +
                "Signal strength(int):" + snr1 + "\n" +
                "-----------------------------" + "\n" +
                "Number satellite(int):" + satId2 + "\n" +
                "Elevation angle(int):" + elevation2 + "\n" +
                "Azimuth(int):" + azimuth2 + "\n" +
                "Signal strength(int):" + snr2 + "\n" +
                "-----------------------------" + "\n" +
                "Number satellite(int):" + satId3 + "\n" +
                "Elevation angle(int):" + elevation3 + "\n" +
                "Azimuth(int):" + azimuth3 + "\n" +
                "Signal strength(int):" + snr3);


    }

    static void glgsvMethod() {
        circumcision(GLGSV);

        String type = subStr[0];
        int messQuant = subStr[1].equals("") ? 0 : Integer.valueOf(subStr[1]); //quantity massage
        int messageId = subStr[2].equals("") ? 0 : Integer.valueOf(subStr[2]); // number massage
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

        System.out.println("Type of message(String):" + type + "\n" +
                "Quantity message(int):" + messQuant + "\n" +
                "Number of message(int):" + messageId + "\n" +
                "Quantity of satellite(int):" + qSat + "\n" +
                "-----------------------------" + "\n" +
                "Number satellite(int):" + satId + "\n" +
                "Elevation angle(int):" + elevation + "\n" +
                "Azimuth(int):" + azimuth + "\n" +
                "Signal strength(int):" + snr + "\n" +
                "-----------------------------" + "\n" +
                "Number satellite(int):" + satId1 + "\n" +
                "Elevation angle(int):" + elevation1 + "\n" +
                "Azimuth(int):" + azimuth1 + "\n" +
                "Signal strength(integer):" + snr1 + "\n" +
                "-----------------------------" + "\n" +
                "Number satellite(int):" + satId2 + "\n" +
                "Elevation angle(int):" + elevation2 + "\n" +
                "Azimuth(int):" + azimuth2 + "\n" +
                "Signal strength(int):" + snr2);
    }

    static void gngllMethod() {
        circumcision(GNGLL);
        String type = subStr[0];
        double latitude = subStr[1].equals("") ? 0 : Double.valueOf(subStr[1]); //latitude
        char dir = subStr[2].equals("") ? '-' : subStr[2].charAt(0);
        double longitude = subStr[3].equals("") ? 0 : Double.valueOf(subStr[3]); //longitude
        char dir1 = subStr[4].equals("") ? '-' : subStr[4].charAt(0);
        double time = subStr[5].equals("") ? 0 : Double.valueOf(subStr[5]);
        char dataType = subStr[6].equals("") ? '-' : subStr[6].charAt(0);

        System.out.println("Type of message(String):" + type + "\n" +
                "Latitude(double,char):" + latitude + "," + dir + "\n" +
                "Longitude(double,char):" + longitude + "," + dir1 + "\n" +
                "Time registration hhmmss(double):" + time + "\n" +
                "Valid data(char):" + dataType);


    }

    static void gnrmcMethod() {
        circumcision(GNRMC);


        String type = subStr[0];
        double time = subStr[1].equals("") ? 0 : Double.valueOf(subStr[1]);
        char status = subStr[2].equals("") ? '-' : subStr[2].charAt(0);
        double lat = subStr[3].equals("") ? 0 : Double.valueOf(subStr[3]);
        char dirLat = subStr[4].equals("") ? '-' : subStr[4].charAt(0);
        double lon = subStr[5].equals("") ? 0 : Double.valueOf(subStr[5]);
        char dirLon = subStr[6].equals("") ? '-' : subStr[6].charAt(0);
        double speed = subStr[7].equals("") ? 0 : Double.valueOf(subStr[7]);
        double course = subStr[8].equals("") ? 0 : Double.valueOf(subStr[8]);
        long date = subStr[9].equals("") ? 0 : Long.valueOf(subStr[9]);
        char mode = subStr[10].equals("") ? '-' : subStr[10].charAt(0);

        System.out.println("Message type(String):" + type + "\n" +
                "Time(double):" + time + "\n" +
                "Status(char):" + status + "\n" +
                "Latitude(double,char):" + lat + "," + dirLat + "\n" +
                "Longitude(double,char):" + lon + "," + dirLon + "\n" +
                "Speed(double):" + speed + "\n" +
                "Course(double):" + course + "\n" +
                "Date(long):" + date + "\n" +
                "Mode(char):" + mode);


        System.out.println(time);


    }

    static void gnvtgMethod() {
        circumcision(GNVTG);

        String messType = subStr[0];
        double course1 = subStr[1].equals("") ? 0 : Double.valueOf(subStr[1]);
        char t = subStr[2].equals("") ? '-' : subStr[2].charAt(0);
        double course2 = subStr[3].equals("") ? 0 : Double.valueOf(subStr[3]);
        char m = subStr[4].equals("") ? '-' : subStr[4].charAt(0);
        double speed1 = subStr[5].equals("") ? 0 : Double.valueOf(subStr[5]);
        char n = subStr[6].equals("") ? '-' : subStr[6].charAt(0);
        double speed2 = subStr[7].equals("") ? 0 : Double.valueOf(subStr[7]);
        char k = subStr[8].equals("") ? '-' : subStr[8].charAt(0);
        char mode = subStr[9].equals("") ? '-' : subStr[9].charAt(0);

        System.out.println("Message type(String):" + messType + "\n" +
                "Course over ground, degrees True(double,char):" + course1 + t + "\n" +
                "Course over ground, degrees Magnetic(double,char):" + course2 + m + "\n" +
                "Speed over ground in knots(double,char):" + speed1 + n + "\n" +
                "Speed over ground in kilometers per hour(double,char):" + speed2 + k + "\n" +
                "Mode(char):" + mode);


    }

    static void gnggaMethod() {
        circumcision(GNGGA);

        String messType = subStr[0];
        double time = subStr[1].equals("") ? 0 : Double.valueOf(subStr[1]);
        double lat = subStr[2].equals("") ? 0 : Double.valueOf(subStr[2]); //latitude
        char dirLat = subStr[3].equals("") ? '-' : subStr[3].charAt(0);
        double lon = subStr[4].equals("") ? 0 : Double.valueOf(subStr[4]); //longitude
        char dirLon = subStr[5].equals("") ? '-' : subStr[5].charAt(0);
        int gpsIndic = subStr[6].equals("") ? 0 : Integer.valueOf(subStr[6]);
        int satUsed = subStr[7].equals("") ? 0 : Integer.valueOf(subStr[7]);
        double hdop = subStr[8].equals("") ? 0 : Double.valueOf(subStr[8]);
        double altitude = subStr[9].equals("") ? 0 : Double.valueOf(subStr[9]);
        char m1 = subStr[10].equals("") ? '-' : subStr[10].charAt(0);
        double geoSepar = subStr[11].equals("") ? 0 : Double.valueOf(subStr[11]);
        char m2 = subStr[12].equals("") ? '-' : subStr[12].charAt(0);
        String nothing = subStr[13];
        int dgpsId = subStr[14].equals("") ? 0 : Integer.valueOf(subStr[14]);

        System.out.println("Message type(String):" + messType + "\n" +
                "Time(double):" + time + "\n" +
                "Latitude(double,char):" + lat + "," + dirLat + "\n" +
                "Longitude(double,char):" + lon + "," + dirLon + "\n" +
                "GPS indicate(int):" + gpsIndic + "\n" +
                "Satellite used(int):" + satUsed + "\n" +
                "Horizontal dilution of precision(double):" + hdop + "\n" +
                "Altitude(double,char):" + altitude + m1 + "\n" +
                "Geoidal Separation(double,char):" + geoSepar + m2 + "\n" +
                "DGPS Station ID(int):" + dgpsId);


    }

    static void gngsaMethod(){
        circumcision(GNGSA);

        String messType = subStr[0];
        char mode = subStr[1].equals("") ? '-' : subStr[1].charAt(0);
        int mode1 = subStr[2].equals("") ? 0 : Integer.valueOf(subStr[2]);
        int sat1 = subStr[3].equals("") ? 0 : Integer.valueOf(subStr[3]);
        int sat2 = subStr[4].equals("") ? 0 : Integer.valueOf(subStr[4]);
        int sat3 = subStr[5].equals("") ? 0 : Integer.valueOf(subStr[5]);
        int sat4 = subStr[6].equals("") ? 0 : Integer.valueOf(subStr[6]);
        int sat5 = subStr[7].equals("") ? 0 : Integer.valueOf(subStr[7]);
        int sat6 = subStr[8].equals("") ? 0 : Integer.valueOf(subStr[8]);
        int sat7 = subStr[9].equals("") ? 0 : Integer.valueOf(subStr[9]);
        int sat8 = subStr[10].equals("") ? 0 : Integer.valueOf(subStr[10]);
        int sat9 = subStr[11].equals("") ? 0 : Integer.valueOf(subStr[11]);
        int sat10 = subStr[12].equals("") ? 0 : Integer.valueOf(subStr[12]);
        int sat11 = subStr[13].equals("") ? 0 : Integer.valueOf(subStr[13]);
        int sat12 = subStr[14].equals("") ? 0 : Integer.valueOf(subStr[14]);
        double pdop = subStr[15].equals("") ? 0 : Double.valueOf(subStr[15]);
        double hdop = subStr[16].equals("") ? 0 : Double.valueOf(subStr[16]);
        double vdop = subStr[17].equals("") ? 0 : Double.valueOf(subStr[17]);

        System.out.println("Type of message(String):" + messType +
                "\nMode 'M/A'(char):" + mode +
                "\nMode '1/2/3'(int):" + mode1 +
                "\nSatellite #1(int)" + sat1 +
                "\nSatellite #1(int)" + sat2 +
                "\nSatellite #1(int)" + sat3 +
                "\nSatellite #1(int)" + sat4 +
                "\nSatellite #1(int)" + sat5 +
                "\nSatellite #1(int)" + sat6 +
                "\nSatellite #1(int)" + sat7 +
                "\nSatellite #1(int)" + sat8 +
                "\nSatellite #1(int)" + sat9 +
                "\nSatellite #1(int)" + sat10 +
                "\nSatellite #1(int)" + sat11 +
                "\nSatellite #1(int)" + sat12);



    }


    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("1-GPGSV | 2-GLGSV | 3-GNGLL | 4-GNRMC | 5-GNVTG | 6-GNGGA | 7 -GNGSA" +
                "\nEnter number:");
        x = sc.nextInt();
        switch (x) {
            case 1:
                gpgsvMethod();
                break;
            case 2:
                glgsvMethod();
                break;
            case 3:
                gngllMethod();
                break;
            case 4:
                gnrmcMethod();
                break;
            case 5:
                gnvtgMethod();
                break;
            case 6:
                gnggaMethod();
                break;
            case 7: gngsaMethod();
            break;

            default:
                System.out.println("You type wrong number");
        }


    }
}