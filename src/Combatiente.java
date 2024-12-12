public interface Combatiente {
    void atacar(Combatiente enemigo);
    void recibirDanio(int danio);
    boolean estaVivo();
}
