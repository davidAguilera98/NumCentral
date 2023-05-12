package numcentralfunciones;

import java.util.Scanner;

/**
 * Este codigo encuentra el numero central entre tres enteros
 * 
 * @author David
 */

public class NumCentralFunciones {

    /**
     * El método principal lee los números de entrada del usuario y llama al
     * método central para calcular el número central.
     *
     * @param args Matriz de cadenas que contiene los argumentos de línea de
     * comandos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos, numeroA, numeroB, numeroC, numeroCentral;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {

            numeroA = sc.nextInt();
            numeroB = sc.nextInt();
            numeroC = sc.nextInt();

            numeroCentral = central(numeroA, numeroB, numeroC);

            System.out.println("El numero central es " + numeroCentral);
        }
    }

    /**
     * El método central coge tres números enteros como argumentos y devuelve el
     * número central.
     *
     * @param numero1 El primer número entero.
     * @param numero2 El segundo número entero.
     * @param numero3 El tercer número entero.
     * @return El número central de los tres números de entrada.
     */
    
    public static int central(int numero1, int numero2, int numero3) {

        int resultado;

        if (numero1 > numero2 && numero1 < numero3 || (numero1 < numero2 && numero1 > numero3)) {
            resultado = numero1;

        } else if (numero2 > numero1 && numero2 < numero3 || (numero2 < numero1 && numero2 > numero3)) {
            resultado = numero2;

        } else {
            resultado = numero3;

        }
        return resultado;
    }

}
