package Generick;

public abstract class Product<T extends Product<T>> implements Comparable<Product<T>>{
    String name;
    float price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public int compareTo(Product o) {
        return 0;
    }


    abstract int subCompare(T o);/*{
        if (name.equals(o.name) &&price - o.price <= 0.0001){
            return 0;
        }
        return -1;
    }*/
}
