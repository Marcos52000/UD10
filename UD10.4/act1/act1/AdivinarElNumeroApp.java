package act1;

import java.util.InputMismatchException;


import javax.swing.JOptionPane;

public class AdivinarElNumeroApp {

    public static void main(String[] args) {
       
        int numRandom = (int) (Math.random() * 500);
        
        int num = 0;
        int intentos = 0;
        do {
            boolean leido;
            do {
                System.out.println("Introduzca un numero (del 1 al 500)");
                try {
                    intentos++;
                    num = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
                    System.out.println("El numero introducido es: " + num);
                    leido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("No has introducido un numero entero");         
                    leido = false;
                }
            } while (leido == false);

            if (num > numRandom) {
                System.out.println("El numero es menor. Introduce de nuevo un número");

            }
            if (num < numRandom) {
                System.out.println("El numero es mayor. Introduce de nuevo un número");
            }

        } while (num != numRandom);

        System.out.println("Has acertado, el numero es: " + numRandom);
        System.out.println("Número de intentos: " + intentos);

    }

}