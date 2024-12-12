
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

        System.out.println("Elige un Fernando: \n 1--guerrero \n 2--mago \n 3--arquero");

        int opcion = sc.nextInt();
        //{Batalla.iniciarBatalla(guerrero, mago);}
        switch (opcion) {
            case 1:{
                System.out.println("contra quien pelearas? \n 1--mago \n 2--arquero");
                int opcionA = sc.nextInt();
                switch (opcionA)
                {
                    case 1:{
                        {Batalla.iniciarBatalla(guerrero, mago);}
                    }
                    break;
                    case 2:{
                        {Batalla.iniciarBatalla(guerrero, Arquero);}
                    }
                    break;

                    default: {
                        System.out.println("womp womp");
                    }
                }
            }
            break;
            case 2:{
                System.out.println("contra quien pelearas? \n 1--guerrero \n 2--arquero");
                int opcionB = sc.nextInt();
                switch (opcionB)
                {
                    case 1:{
                        {Batalla.iniciarBatalla(mago, guerrero);}
                    }
                    break;
                    case 2:{
                        {Batalla.iniciarBatalla(mago, Arquero);}
                    }
                    break;

                    default: {
                        System.out.println("womp womp");
                    }
                }
            }
            break;
            case 3:{
                System.out.println("contra quien pelearas? \n 1--mago \n 2--guerrero");
                int opcionC = sc.nextInt();
                switch (opcionC)
                {
                    case 1:{
                        {Batalla.iniciarBatalla(Arquero, mago);}
                    }
                    break;
                    case 2:{
                        {Batalla.iniciarBatalla(Arquero, guerrero);}
                    }
                    break;

                    default: {
                        System.out.println("womp womp");
                    }
                }
            }
            break;

            default: {
                System.out.println("womp womp");
            }
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

