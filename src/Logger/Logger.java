package Logger;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public enum Logger {
    INSTANCE;

    enum WorkMode{
        RELEASE,DEBUG
    }
    final WorkMode workMode;
    private File[] logFiles;
    private FileOutputStream[] fos;

    Logger(){
        File file = new File("LoggConfig.cfg");
        WorkMode temp = WorkMode.RELEASE;
        if (file.exists()){
            try {
                FileInputStream fis = new FileInputStream(file);
                byte[] fisAvailable = new byte[fis.available()] ;
                fis.read(fisAvailable);
                String strOne = new String(fisAvailable);
                if("debug".equals(strOne.toLowerCase())){
                    temp = WorkMode.DEBUG;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        workMode = temp;
        fileInitializer();
        fileOutputStreamsInitializer();

    }
    private void fileInitializer(){
        TypeInfo[] types = TypeInfo.values();
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        String dateString = sdf.format(currentDate);
        logFiles = new File[types.length+1];

        for (int i = 0; i <logFiles.length-1 ; i++) {
            logFiles[i] = new File(types[i]+" "+dateString+" "+"lof.log");
            if (!logFiles[i].exists()){
                try {
                    logFiles[i].createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        logFiles[logFiles.length-1] = new File("All_"+dateString+" "+"lof.log");
        if (!logFiles[logFiles.length-1].exists()){
            try {
                logFiles[logFiles.length-1].createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    private void fileOutputStreamsInitializer(){
        fos = new FileOutputStream[logFiles.length];
        for (int i = 0; i <fos.length ; i++) {
            try {
                fos[i] = new FileOutputStream(logFiles[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    }

    public void log(TypeInfo type,String message){
        byte index = getIndex(type);
        if (index==-1){
            return;
        }
        try {
            fos[index].write(message.getBytes());
            fos[fos.length-1].write(message.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private byte getIndex(TypeInfo type){
        TypeInfo typeInfo[] = TypeInfo.values();
        for (byte i = 0; i <typeInfo.length ; i++) {
            if (typeInfo[i].equals(type)){
                return i;
            }

        }
        return -1;
    }
    /*private String messageFormalizer(TypeInfo type, String message){}*/

    public void close(){
        for (FileOutputStream stream:fos) {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


}
