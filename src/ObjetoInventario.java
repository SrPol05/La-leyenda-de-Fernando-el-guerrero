import java.util.Comparator;

public class ObjetoInventario {
    private String nombre;
    private int valor;

    public ObjetoInventario(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }
}

class ComparadorPorValor implements Comparator<ObjetoInventario> {
    @Override
    public int compare(ObjetoInventario o1, ObjetoInventario o2) {
        return Integer.compare(o2.getValor(), o1.getValor());
    }
}
