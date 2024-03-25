import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        // Crea un algoritmo que solicite al usuario ingresar un número entero no
        // negativo y calcule su factorial. El factorial de un número es el producto de todos los enteros
        // ositivos desde 1 hasta ese número.
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un num entero no negativo= ");
        int num;
        num=leer.nextInt();
       while (num<0) {
           System.out.println("ingrese un numero positivo: ");
           num= leer.nextInt();
       }
        if (num == 0) {
            System.out.println("El factorial de 0 es 1.");
        } else {
            int facto = 1;
             for (int i = 1; i <= num; i++) {
               facto *= i;
            }
            System.out.println("El factorial de " + num + " es: " + facto);
        }
    }
    }

