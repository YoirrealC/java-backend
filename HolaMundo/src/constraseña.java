import java.util.Scanner;

public class constraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa una contraseña:");
        String password = scanner.nextLine();

        if (password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }
        System.out.println("Por favor ingresa nuevamente la contraseña para verificar:");
        String confirmPassword = scanner.nextLine();

        if (password.equals(confirmPassword)) {
            System.out.println("¡Contraseña establecida correctamente!");
        } else {
            System.out.println("Las contraseñas no coinciden. Por favor intenta nuevamente.");
        }
    }
}