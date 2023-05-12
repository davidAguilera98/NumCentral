package numcentralfunciones;

import java.util.Scanner;

public class NumCentralFunciones {

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
