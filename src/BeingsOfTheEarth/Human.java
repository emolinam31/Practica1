package BeingsOfTheEarth;

import SkyBeings.SkyBeing;

public class Human extends LivingBeings implements EarthBeing, SkyBeing{

    private int edad;
    private String nombre;

    public Human(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
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


    @Override
    public void born() {
        System.out.println("Soy " + getNombre() + " Tengo "+ getEdad() + " Años y acabe de nacer...");
    }

    @Override
    public void grow(){
        System.out.println("Soy " + getNombre() + " Tengo "+ getEdad() + " Años y Estoy Creciendo...");
    }

    @Override
    public void die() {
        System.out.println("Soy " + getNombre() + " Tengo "+ getEdad() + " Años y Mori...");
    }

    public String toString() {
        System.out.println(
                "Edad = " + edad +
                "\nNombre = " + nombre );
        return null;
    }

    @Override
    public String createLivingBeings() {
        return null;
    }



    //Metodos de SkyBeing a los cuales solo puede acceder Human
    @Override
    public void fly() {

    }

    @Override
    public void changeDimension() {
        System.out.println("Como soy " + getNombre() +  " y soy Humano no puedo cambiar de dimension ");

    }

    @Override
    public void respawn() {
        System.out.println("Como soy " + getNombre() +  " y soy Humano no puedo volver a nacer ");

    }
}
