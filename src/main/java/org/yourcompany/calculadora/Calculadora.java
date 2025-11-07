package org.yourcompany.calculadora;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oriol Virgili Garrigós
 */


public class Calculadora {
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
            //Thread.sleep(500); // pausa de 500 mil·lisegons
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
    System.out.printf("L'entrada del cinema val %.2f€.", entrada);
    teclat.close();
    return entrada;
}
    public static void mostrarMenuConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvingut a la calculadora!");
        System.out.println("Selecciona una opció:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Calcular potència");
        System.out.println("6. Sortir");
        int opcio = scanner.nextInt();
        while (opcio!=0) {
        switch (opcio) {
            case 1:
                System.out.println("Has seleccionat Sumar");
                int n = scanner.nextInt();
                int r = nombreDigits(n);
                System.out.println("resultat:" + r);
                break;
            case 2:
                System.out.println("Has seleccionat Restar");
                int n2 = scanner.nextInt();
                int r2 = nombreDigits(n2);
                System.out.println("resultat:" + r2);
                break;
            case 3:
                System.out.println("Has seleccionat Multiplicar");
                int n3 = scanner.nextInt();
                int r3 = nombreDigits(n3);
                System.out.println("resultat:" + r3);
                break;
            case 4:
                System.out.println("Has seleccionat Dividir");
                int n4 = scanner.nextInt();
                int r4 = nombreDigits(n4);
                System.out.println("resultat:" + r4);
                break;
            case 5:
                System.out.println("Has seleccionat Calcular potència");
                int n5 = scanner.nextInt();
                int r5 = nombreDigits(n5);
                System.out.println("resultat:" + r5);
                break;
            case 6:
                System.out.println("Sortint...");
                System.exit(0); 
                break;
            default:
                System.out.println("Opció no vàlida");
        }
        scanner.close();
    }
}
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
        System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        System.out.println("Factorial de 5: " + calcularFactorial(5));
        System.out.println("Factorial de 7: " + calcularFactorial(7));
        System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

    }

 

public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }   
public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    } 
public static long calcularPotencia(int base, int exponent) {
        long resultat = 1;
        int i = 0;
        while (i < exponent) {
            long temp = 0;
            int j = 0;
            while (j < base) {
                temp += resultat;
                j++;
            }
            resultat = temp;
            i++;
        }
        return resultat;
    }

}