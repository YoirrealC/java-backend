import java.util.Scanner;

public class monedas {
    public static void main(String[] args) {
        //Desarrolla un programa que permita al usuario convertir una cantidad de pesos argentinos a dolares.
        // El usuario debe ingresar la cantidad en pesos, y el programa debe realizar la conversión y mostrar el
        // resultado. Utiliza una tasa de conversión fija.

        Scanner leer= new Scanner(System.in);
        double pesos, dolar;
        System.out.println("ingrese la cantidad de pesos argentinos a convertir: ");
        pesos= leer.nextDouble();
        dolar= pesos/950;
        System.out.println("la cantidad de dolares es de : " + dolar);

    }
}
