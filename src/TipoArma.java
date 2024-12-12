
public enum TipoArma {
    ESPADA(10), ARCO(8), BASTON_MAGICO(12);

    private final int danioBase;

    TipoArma(int danioBase) {
        this.danioBase = danioBase;
    }

    public int getDanioBase() {
        return danioBase;
    }
}
