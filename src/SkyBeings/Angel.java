package SkyBeings;

public class Angel implements SkyBeing{

    private int edad;
    private String nombre;

    public Angel(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }



    @Override
    public void fly() {
        System.out.println("Soy el Angel: " + getNombre() + " Tengo " + getEdad() + " años y estoy Volando");
    }

    @Override
    public void changeDimension() {
        System.out.println("Soy el Angel: " + getNombre() + " Tengo " + getEdad() + " años y estoy cambiando de dimension...");

    }

    @Override
    public void respawn() {
        System.out.println("Soy el Angel: " + getNombre() + " Tengo " + getEdad() + " años y puedo reenacer...");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String toString() {
        System.out.println("Nombre = " + getNombre() + "\nEdad = " + getEdad());
        return null;
    }
}
