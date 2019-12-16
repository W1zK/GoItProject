package Generick;

public class Conteiner <T  extends Comparable<T>>{
    private T item;


    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


}
