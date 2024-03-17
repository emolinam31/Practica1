package BeingsOfTheEarth;
import java.util.*;

abstract public class LivingBeings implements EarthBeing, Creator{
    Scanner tc = new Scanner(System.in);

    @java.lang.Override
    public void born() {
        System.out.println("Acabe de nacer por que soy un ser de la tierra");

    }

    @java.lang.Override
    public void grow() {
        System.out.println("Estoy creciendo porque soy un ser de la tierra");

    }

    @java.lang.Override
    public void die() {
        System.out.println("Acabe de morir por que soy un ser de la tierra");

    }


}
