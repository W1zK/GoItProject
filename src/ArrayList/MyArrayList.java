package ArrayList;


import java.lang.reflect.Array;

public class MyArrayList<T> {

    private T[] mass ;


    public MyArrayList(Class<T> c, int size) {

        mass  = (T[]) Array.newInstance(c,size);
    }
    public MyArrayList(Class<T> c) {

        mass  = (T[]) Array.newInstance(c,10);
    }




    void add(T value){

    }




}
