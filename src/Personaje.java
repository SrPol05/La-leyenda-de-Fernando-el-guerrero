public abstract class Personaje implements Combatiente {
    protected String nombre;
    protected int salud;
    protected int nivel;
    protected TipoArma arma;

    public Personaje(String nombre, int salud, int nivel, TipoArma arma) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    @Override
    public boolean estaVivo() {
        return salud > 0;
    }

    @Override
    public void recibirDanio(int danio) {
        salud -= danio;
        if (salud < 0) salud = 0;
    }

    public abstract void usarHabilidad(Combatiente enemigo);
}
