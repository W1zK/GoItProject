package FindeFile;

import java.io.File;


public class Main {
    static File folder = new File("/fileForSearch/");


    static void finder (File folder, String name){
        if (folder.isDirectory()) {
            File[] listOfFolder = folder.listFiles();
            for (int i = 0; i <listOfFolder.length ; i++) {
                if (listOfFolder[i].isFile()){
                    if (listOfFolder[i].getName().equals(name)){
                        System.out.println(listOfFolder[i].getPath());
                        System.out.println("123");
                    }else System.out.println("wrong name");
                }else if (listOfFolder[i].isDirectory()){
                    finder(listOfFolder[i],name);

                }

            }
        }





    }
    public static void main(String[] args) {

        finder(folder, "qwe.txt");

    }
}
