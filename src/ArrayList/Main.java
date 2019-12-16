package ArrayList;

import java.util.LinkedList;

public class Main {
    static MyLinkedList<String> str =new MyLinkedList<>();

    public static void main(String[] args) {
        str.add("gogo");
        str.add("123123");
        str.add("5756756");
        str.add("kolokl");
        str.dump();
        //str.remove(0);
        System.out.println(str.getCount());
    }

}
