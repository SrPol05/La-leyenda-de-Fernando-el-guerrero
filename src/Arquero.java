public class Arquero extends Personaje {
    public Arquero(String nombre, int salud, int nivel, TipoArma arma) {
        super(nombre, salud, nivel, arma);
    }

    @Override
    public void atacar(Combatiente enemigo) {
        int danio = arma.getDanioBase() + nivel;
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " dispara una flecha con su " + arma + " causando " + danio + " de daño.");
    }

    @Override
    public void usarHabilidad(Combatiente enemigo) {
        int danio = (arma.getDanioBase() + nivel * 2);
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " usa su habilidad 'Tiro preciso', causando " + danio + " de daño.");
    }
}
