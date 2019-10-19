package offline1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException {
        Switcher switcher = new Switcher();
        switcher.addElectricityConsumer(new Lamp());
        switcher.addElectricityConsumer(new Plasma());
        switcher.addElectricityConsumer(new Tolik());
        switcher.addElectricityConsumer(new LedLamp());
        switcher.addElectricityConsumer(new ElectricityConsumer() {
            @Override
            public void onElectricityOn() {
                System.out.println("short circuit");
            }

            @Override
            public String getType() {
                return this.getClass().getSimpleName();
            }
        });
        //Lamp lamp = new Lamp();
//        Lamp.Filament filament = new Lamp().new Filament();
//        switcher.electricityEnable();
//        for (ElectricityConsumer temp:switcher.getConsumers()) {
//            System.out.println(temp.getType());
//
//        }
        Class cl = Lamp.class;
        for (Method method:cl.getDeclaredMethods()) {
            for (Annotation annotation:method.getAnnotations()) {
                System.out.println(annotation.annotationType().getSimpleName());

            }

        }
        //System.out.println(Lamp.class.getDeclaredField("filament").getType().getSimpleName());

    }

}
