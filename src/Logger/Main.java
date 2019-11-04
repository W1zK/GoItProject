package Logger;

public class Main {
    {
        Logger.INSTANCE.log(TypeInfo.INFO,"use block");

    }

    static {
        Logger.INSTANCE.log(TypeInfo.INFO,"use static block");

    }
    public static void main(String[] args) {
        Logger.INSTANCE.log(TypeInfo.INFO,"start main");


    }
}
