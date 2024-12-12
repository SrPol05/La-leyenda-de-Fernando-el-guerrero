
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Crear personajes
        Personaje guerrero = new Guerrero("Fernando alonso", 100, 5, TipoArma.ESPADA);
        Personaje mago = new Mago("Fernando magonso", 80, 6, TipoArma.BASTON_MAGICO);
        Personaje Arquero = new Arquero("Fernando Arconso", 45, 5, TipoArma.ARCO);

        // Iniciar batalla

        Scanner sc = new Scanner(System.in);

        System.out.println("Elige combate!!! \n 1-- Guerrero contra Mago  \n 2-- Guerrero contra Arquero \n 3-- Arquero contra Mago");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:{Batalla.iniciarBatalla(guerrero, mago);}
            break;
            case 2:{Batalla.iniciarBatalla(guerrero, Arquero);}
            break;
            case 3:{Batalla.iniciarBatalla(Arquero, mago);}
            break;
            default: {System.out.println("womp womp");}
        }

        // Crear inventario
        ArrayList<ObjetoInventario> inventario = new ArrayList<>();
        inventario.add(new ObjetoInventario("Espada legendaria", 100));
        inventario.add(new ObjetoInventario("Poción de vida", 50));
        inventario.add(new ObjetoInventario("Arco encantado", 75));

        // Ordenar inventario
        Collections.sort(inventario, new ComparadorPorValor());
        System.out.println("\nInventario ordenado por valor:");
        for (ObjetoInventario objeto : inventario) {
            System.out.println(objeto.getNombre() + " - Valor: " + objeto.getValor());
        }
    }
}

