package org.yourcompany.calculadora;
import java.util.Scanner;

/**
 *
 * @author Oriol Virgili Garrigós
 */

public class Calculadora {
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
        int n=0;
        switch (opcio) {
            case 1:
                System.out.println("Has seleccionat Sumar");
                System.out.println("Introdeix un numero:");
                n=scanner.nextInt();
                System.out.println("Suma de" + sumaPrimersNumeros(n));
                scanner.close();
                break;
            case 2:
                System.out.println("Has seleccionat Factorial");
                System.out.println("Introdeix un numero:");
                n=scanner.nextInt();
                System.out.println("Factorial de : " + calcularFactorial(n));
                scanner.close();
                break;
            case 3:
                System.out.println("Has seleccionat suma dels quadrats");
                System.out.println("Introdeix un numero:");
                n=scanner.nextInt();
                System.out.println("Suma dels quadrats dels primers "+n+" números: " + sumaQuadrats(n));
                scanner.close();
                break;
            case 4:
                System.out.println("Has seleccionat potència");
                System.out.println("Introdeix un numero:");
                int base=scanner.nextInt();
                System.out.println("Introdeix un altre numero:");
                int exponent=scanner.nextInt();
                System.out.println(""+base+" elevat a la potència "+exponent+": " + calcularPotencia(base, exponent));
                break;
            case 5:
                System.out.println("Nombre digits");
                System.out.println("Introdeix un numero:");
                int nombre=scanner.nextInt();
                System.out.println("Nombre de dígits de "+nombre+": " + nombreDigits(nombre));
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



        // Exemples de crida per al mètode sumaQuadrats


        // Exemples de crida per al mètode calcularPotencia

        mostrarMenuConsola();
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
}