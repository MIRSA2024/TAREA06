//Crea un programa que calcula la factorial de un número ingresado por el usuario.
package Tarea_Semana06;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // declarar variables 
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero para calcular su factorial: ");
        int numero = sc.nextInt();
        //proceso de datos
        int factorial = 1;
        int contador = 1;
        
        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }
        //salida de datos
        System.out.println("El factorial de " + numero + " es " + factorial);

    }
}

