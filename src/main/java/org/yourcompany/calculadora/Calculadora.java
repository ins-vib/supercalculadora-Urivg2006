package org.yourcompany.calculadora;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oriol Virgili Garrigós
 */


public class Calculadora {

    public static void main(String[] args) {

        // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));
        try {
            int cares = numeroCares(100);
            System.out.println("Nombre de cares: " + cares);
            System.out.println("Nombre de creus: " + (100 - cares));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Operació interrompuda mentre es comptaven les cares.");
        }
        preuCinema(5,true,true);
        // Exemples de crida per al mètode sumaPrimersNumeros
        // System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        // System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        // System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        // System.out.println("Factorial de 5: " + calcularFactorial(5));
        // System.out.println("Factorial de 7: " + calcularFactorial(7));
        // System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        // System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        // System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        // System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

       
        
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    } 
    public static int numeroCares(int repeticions) throws InterruptedException {
       Random rand = new Random();
        int num;
        byte contador=0;
        byte cara=0;
        //byte creu=0;
        
        while (contador < 100) { 
            num = rand.nextInt(2); 

            if (num == 0) {
                String moneda = "cara";
                cara++;
                System.out.println("Ha sortit " + moneda + ".");
            } else {
                String moneda = "creu";
                //creu++;
                System.out.println("Ha sortit " + moneda + ".");
            }

            contador++;
            Thread.sleep(500); // pausa de 500 mil·lisegons
        }

        System.out.println("Fi de les 100 tirades.");
        return cara;
        
    }

public static double preuCinema(double preuBase, boolean capSetmana, boolean carnetJove) {
    Scanner teclat = new Scanner(System.in);
    //System.out.println("Indica de quin tipus de dia disposa: (Laborable=L, Cap de setmana=C  )");
    //char tipus_entrada = teclat.next().charAt(0);
    //System.out.println("Disposa de carnet Jove (S/N) ");
    //char descompte = teclat.next().charAt(0);
    double entrada=preuBase;
    if (capSetmana==true) {
        entrada=entrada*0.15;
    }
    if (carnetJove==true) {
        entrada=entrada*0.10;
    }
    System.out.println("L'entrada del cinema val " + entrada + " €.");
    teclat.close();
    return entrada;
}

}


    


