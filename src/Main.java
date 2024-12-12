import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Crear personajes
        Personaje guerrero = new Guerrero("Thor", 100, 5, TipoArma.ESPADA);
        Personaje mago = new Mago("Gandalf", 80, 6, TipoArma.BASTON_MAGICO);

        // Iniciar batalla
        Batalla.iniciarBatalla(guerrero, mago);

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

