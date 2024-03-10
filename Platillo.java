import java.io.*;
public abstract class Platillo {
    void prepararPlatillo(){
        agregarPan();
        agregarMayonesa();
        agregarMostaza();
        prepararProteina();
        ponerProteina();
        if(conQueso()){
            agregarQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPan();
    }

    void agregarPan(){
        System.out.println("Colocando pan...\n");
    }

    void agregarMayonesa(){
        System.out.println("Agregando mayonesa...\n");
    }

    void agregarMostaza(){
        System.out.println("Agregando mostaza...\n");
    }

    void ponerProteina(){
        System.out.println("Agregando carne...\n");

        System.out.println("Agregando deliciosa soya!...\n");
    }

    abstract void agregarQueso();

    abstract void prepararProteina();

    boolean esVegetariana(){
        return true;
    }

    boolean conQueso(){
        return true;
    }

    void ponerVegetales(){
        System.out.println("\nAgregando vegetales...\n");
    }

    void ponerCatsup(){
        System.out.println("Agregando catsup...\n");
    }

    void ponerPan(){
        System.out.println("Terminando hamburguesa deliciosa!\n");
    }
}