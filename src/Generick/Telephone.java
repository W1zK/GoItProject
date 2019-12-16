package Generick;

public class Telephone extends Product<Telephone> {
    String model;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    int subCompare(Telephone o) {
        return 0;
    }


}
