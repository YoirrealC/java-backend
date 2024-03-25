import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        // Pedirle al usuario que ingrese un numero y el programa determine si es par o impar.

        System.out.println("ingrese un numero: ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("el numero es par");
        } else{
            System.out.println("el numero en impar");
    }

    }
}
