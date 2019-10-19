package NMEA2;

public interface MassageStrings {
    static String GPGSV = "$GPGSV,5,3,12,02,52,128,20,01,48,240,30,03,33,054,29,14,27,314,25*47";
    static String GLGSV = "$GLGSV,3,1,11,04,76,148,32,02,62,242,35,01,27,067,35,,,,*47";
    static String GNGLL = "$GPGLL,4915.3920,N,12259.8072,W,222414.00,A*79";
    static String GNRMC = "$GNRMC,165111.98,A,5601.0318,N,01211.3503,E,0.08,43.53,190706,,*3E";
    static String GNVTG = "$GNVTG,30.60,T,,M,0.10,N,0.2,K,D*56";
    static String GNGGA = "$GPGGA,165116.000,5601.0318,N,01211.3504,E,1,07,1.2,22.8,M,41.6,M,2,5438*6E";
    static String GNGSA = "$GNGSA,M,3,17,02,30,04,05,10,09,06,31,12,,,1.2,0.8,0.9*2B";


}
