import java.util.Scanner;

public class Batalla {
    public static void iniciarBatalla(Personaje p1, Personaje p2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Comienza la batalla entre " + p1.getNombre() + " y " + p2.getNombre() + "!");

        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("\nTurno de " + p1.getNombre() + ". Elige acción: 1) Atacar 2) Usar Habilidad");
            int accion = sc.nextInt();
            if (accion == 1) {
                p1.atacar(p2);
            } else {
                p1.usarHabilidad(p2);
            }

            if (!p2.estaVivo()) {
                System.out.println(p2.getNombre() + " ha sido derrotado.");
                break;
            }

            // Turno del segundo personaje
            System.out.println("\nTurno de " + p2.getNombre() + ". Elige acción: 1) Atacar 2) Usar Habilidad");
            accion = sc.nextInt();
            if (accion == 1) {
                p2.atacar(p1);
            } else {
                p2.usarHabilidad(p1);
            }

            if (!p1.estaVivo()) {
                System.out.println(p1.getNombre() + " ha sido derrotado.");
            }
        }
    }
}
