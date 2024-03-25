import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        //Ejercicio 3: Conversor de Temperatura Desarrolla un programa que convierta la temperatura
        // ingresada por el usuario en grados Celsius a grados Fahrenheit. La fórmula para
        // la conversión es: Fahrenheit = (Celsius * 9/5) + 32.
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los °C: ");
        float celcius= 0, faren=0;
        celcius=leer.nextFloat();
        faren=(celcius*9/5)+32;
        System.out.println("la temperatura en faren es: " + faren);
    }
}
