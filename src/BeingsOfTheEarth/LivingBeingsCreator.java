package BeingsOfTheEarth;
import java.util.*;
public class LivingBeingsCreator implements Creator,EarthBeing{
    Scanner tc = new Scanner(System.in);

    private String nombre_Ser;
    private int edad;

    void LivingBeings(String nombre_Ser, int edad){
        this.nombre_Ser = nombre_Ser;
        this.edad = edad;
    }

    @Override
    public String createLivingBeings() {
        System.out.println("Ingrese el nombre del ser Vivo: ");
        setNombre_Ser(tc.next());
        System.out.println("Ingrese la Edad del ser Vivo: ");
        setEdad(tc.nextInt());

        return null;
    }



    public String getNombre_Ser() {
        return nombre_Ser;
    }

    public void setNombre_Ser(String nombre_Ser) {
        this.nombre_Ser = nombre_Ser;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void born() {
        System.out.println("Soy " + getNombre_Ser() + "Tengo " + getEdad()+ " años" + " y Acabe de nacer");
    }

    @Override
    public void grow() {
        System.out.println("Soy " + getNombre_Ser() + "Tengo " + getEdad()+ " años y Apenas estoy creciendo");

    }

    @Override
    public void die() {
        System.out.println("Soy " + getNombre_Ser() + " Tengo " + getEdad()+ " años y mori");

    }

}
