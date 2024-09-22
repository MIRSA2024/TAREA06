//Crea un programa  que invierte los dígitos de un número entero ingresado por el usuario.
package Tarea_Semana06;

import java.util.Scanner;

public class Ejercicio03 {
  
    public static void main(String[] args) {
            // declarar variables 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();
         //proceso de datos
        int invertido = 0;
        
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
           //salida de datos
        System.out.println("El numero invertido es: " + invertido);

    }
}

