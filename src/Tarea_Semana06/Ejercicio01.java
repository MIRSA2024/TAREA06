//Crea un programa que ingrese números hasta que ingrese un número negativo. Luego, el programa calcula el promedio de los números ingresados.
package Tarea_Semana06;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
            // declarar variables 
 Scanner num = new Scanner(System.in);
        
        double suma = 0;
        int contador = 0;
        double numero;
        
        System.out.print("Ingresa un numero (Numero negativo para terminar): ");
        numero = num.nextDouble();
         //proceso de datos
        while (numero >= 0) {
            suma += numero;
            contador++;
            System.out.print("Ingresa otro numero (Numero negativo para terminar): ");
            numero = num.nextDouble();
        }
        
        if (contador > 0) {
            double promedio = suma / contador;
               //salida de datos
            System.out.println("El promedio de los numeros es: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros validos.");
    }
    }
}
