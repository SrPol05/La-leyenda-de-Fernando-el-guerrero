public class Guerrero extends Personaje {
    public Guerrero(String nombre, int salud, int nivel, TipoArma arma) {
        super(nombre, salud, nivel, arma);
    }

    @Override
    public void atacar(Combatiente enemigo) {
        int danio = arma.getDanioBase() + nivel * 2;
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " ataca con " + arma + " causando " + danio + " de daño.\n");
    }

    @Override
    public void usarHabilidad(Combatiente enemigo)
    {
        int danio = (arma.getDanioBase() + nivel * 3);
        enemigo.recibirDanio(danio);
        System.out.println(nombre + " usa su habilidad 'Golpe poderoso', causando " + danio + " de daño.\n");
    }

}
