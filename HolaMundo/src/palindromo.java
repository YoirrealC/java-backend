import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        // Escribe un programa que verifique si una palabra ingresada
        // por el usuario es un palíndromo, es decir, si se lee igual de izquierda a derecha y
        // de derecha a izquierda (ignorando espacios y mayúsculas/minúsculas). Por ejemplo,
        // "reconocer" es un palíndromo.

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra: ");
        String pal = leer.nextLine();
        System.out.println(esPalindromo(pal));
    }

    public static boolean esPalindromo(String pal) {
      pal = pal.replaceAll(" ", "").toLowerCase();

        for (int i = 0; i < pal.length() / 2; i++) {
            if (pal.charAt(i) != pal.charAt(pal.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
