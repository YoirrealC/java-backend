import java.util.Scanner;

public class metroPulga {
    public static void main(String[] args) {
        //Pasar de metro ingresador por el usario a pulgadas.
        Scanner leer= new Scanner(System.in);
        double metro,pulga;
        System.out.println("ingrese metros para pasar a pulgadas: ");
        metro= leer.nextFloat();

        pulga= metro*39.3701;
        System.out.println("las pulgadas son: " + pulga);
    }
}
