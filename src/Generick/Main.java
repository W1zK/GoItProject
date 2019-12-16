package Generick;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Conteiner<Product<Telephone>> productConteiner = new Conteiner<>();
        //Conteiner<String> productConteiner = new Conteiner<>();
        productConteiner.setItem(new Telephone());
        Product product = productConteiner.getItem();
        //product.creat();
        Telephone etl = new Telephone();
        //etl.creat();
        System.out.println(etl.getModel());

        //finder(new ArrayList<Telephone>(),new Telephone());

    }

    static <T extends Product>boolean finder(List<T> productsList,T product){
        for (T pr: productsList) {
            if (product.equals(pr)){
                return true;
            }

        }
        return false;
    }

    static void copy (List<? extends Product> src,List<?super Product> dst){
        for (Product product : src) {
            dst.add(product);

        }

    }
}
