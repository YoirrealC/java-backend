import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        // Calculadora de IMC (Índice de Masa Corporal)
        // Crea un programa que solicite al usuario ingresar su peso (en kilogramos) y su altura (en metros).
        // Luego, calcula el IMC (peso / altura^2) y muestra un mensaje indicando si la persona tiene un peso bajo,
        // normal, sobrepeso u obesidad, según los valores típicos del IMC.

        Scanner leer = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Ingrese su peso en kilogramos: ");
        peso = leer.nextDouble();

        System.out.println("Ingrese su altura en metros: ");
        altura = leer.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Tu IMC indica que tienes un peso bajo.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Tu IMC indica que tienes un peso normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Tu IMC indica que tienes sobrepeso.");
        } else {
            System.out.println("Tu IMC indica que tienes obesidad.");
        }
    }
}
