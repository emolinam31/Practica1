// Clase Main ( Compilacion del codigo )



package Test;
import java.util.*;
import BeingsOfTheEarth.*;
import SkyBeings.*;

public class Main {
    public static void main(String[] args) {

        boolean estado = true;

        Scanner tc = new Scanner(System.in);
        Human humano = new Human(0, "");
        Angel angel = new Angel(0, "");
        LivingBeingsCreator SerNuevo = new LivingBeingsCreator();


        do{
            System.out.println("Bienvenido");
            System.out.println("Selecciona: \n1. Si quieres Ser Humano\n2. Si quieres ser Angel \n3. Si quieres crear un ser vivo");
            int eleccion = tc.nextInt();
            if(eleccion == 1){
                System.out.println("Elige tu nombre: ");
                humano.setNombre(tc.next());
                System.out.println("Elige tu edad: ");
                humano.setEdad(tc.nextInt());
                humano.toString();
                System.out.println("Mostrando Acciones de " + humano.getClass());
                humano.born();
                humano.grow();
                humano.die();

            }
            else if(eleccion == 2){
                System.out.println("Elige tu nombre: ");
                angel.setNombre(tc.next());
                System.out.println("Elige tu edad: ");
                angel.setEdad(tc.nextInt());
                angel.toString();
                System.out.println("Mostrando Acciones de " + angel.getClass());
                angel.fly();
                angel.changeDimension();
                angel.respawn();

            }
            else if (eleccion == 3){
                System.out.println("Elige el ser de la tierra que quieres crear: ");
                SerNuevo.setNombre_Ser(tc.next());
                System.out.println("Elige la edad del ser : ");
                SerNuevo.setEdad(tc.nextInt());
                SerNuevo.born();
                SerNuevo.grow();
                SerNuevo.die();

            }
            else {
                estado = false;
                System.out.println("Programa Cerrado");
            }
        }
        while (estado);







    }
}
