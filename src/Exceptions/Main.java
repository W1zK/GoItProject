package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
   /* public static void main(String[] args) {

        File file = new File("data.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        *//*FileOutputStream fos = null;
        try {
           fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (NullPointerException | IOException e) {
                //
            }
        }*//*



        try( FileOutputStream fos = new FileOutputStream(file)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }*/
   public static void main(String[] args) throws BluetoothException {
       throw new BluetoothException("lol");
   }

}
