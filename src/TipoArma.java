
public enum TipoArma {
    ESPADA(14), ARCO(30), BASTON_MAGICO(12);

    private final int danioBase;

    TipoArma(int danioBase) {
        this.danioBase = danioBase;
    }

    public int getDanioBase() {
        return danioBase;
    }
}
