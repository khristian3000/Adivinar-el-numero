/*
Quiero crear un juego en el que la máquina genere un número al azar (el rango lo elegís vos, entre qué número y qué número)
 y me permita lanzar números hasta adivinarlo. Quiero que me pregunte mi nombre. Quiero que me dé puntos si acierto y
 me saque puntos si no. Mientras no acierte, quiero que me diga si el número a adivinar es más alto o más bajo que el
  que puse (ej.: si el número a adivinar es 34 y yo escribí 23, quiero que me diga “más alto”). Si no acierto, me tiene
  que restar 1 punto. Si acierto, me tiene que sumar 100 y decirme “Ganaste!”. Finalmente, quiero que me diga por
  pantalla: mi nombre, en cuántos intentos lo logré y cuál es mi puntaje final.

Cada vez que lanzo un intento erróneo, quiero que me pregunte si quiero seguir intentándolo: si pongo que no,
debe salir del bucle, darme mi resultado (nombre, cantidad de intentos y puntaje final) y preguntarme si quiero
volver a jugar; si pongo que sí, me debe dar otra oportunidad hasta que ponga que no o que gane. Si elijo volver a
jugar, en cualquier caso, la máquina debe generar un número aleatorio nuevo.

 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String jugador1;
        int num;


        JOptionPane.showMessageDialog(null, "BIENVENIDO AL JUEGO ADIVINA EL NUMERO");
        JOptionPane.showMessageDialog(null, "ADIVINA EL NUMERO ENTRE 1 Y 10");
        jugador1 = JOptionPane.showInputDialog("INDICA TU NOMBRE: ");
        boolean gano=false;

        while(gano!=true) {

            int numAzar = (int) (Math.random() * 9);

            do {
                num = Integer.parseInt(JOptionPane.showInputDialog(jugador1 + " ADIVINA EL NUMERO: "));

                if (numAzar == num) {

                    JOptionPane.showMessageDialog(null, "GANASTE!!");
                    gano=true;

                } else if (numAzar > num) {

                    JOptionPane.showMessageDialog(null, "MAS ALTO");
                } else {

                    JOptionPane.showMessageDialog(null, "MAS BAJO");

                }


                String resp = JOptionPane.showInputDialog(" QUIERES SEGUIR INTENTANDO?? ");


            } while (!resp.equalsIgnoreCase("NO")|| gano);



        }
    }
}