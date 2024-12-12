
public class Mago extends Personaje {
    public Mago(String nombre, int salud, int nivel, TipoArma arma) {
        super(nombre, salud, nivel, arma);
    }

    @Override
    public void atacar(Combatiente enemigo) {
        int danio = arma.getDanioBase() + nivel;
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " lanza un hechizo con su " + arma + " causando " + danio + " de daño.\n");
    }

    @Override
    public void usarHabilidad(Combatiente enemigo) {
        int danio = (arma.getDanioBase() * 2);
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " usa su habilidad 'Explosión mágica', causando " + danio + " de daño.\n");
    }


}
