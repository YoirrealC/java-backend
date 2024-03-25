import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        /*
        Desarrolla una calculadora que permita al usuario ingresar una serie de
         números y luego calcule y muestre la suma y el promedio de esos números.
         */

        float num1, num2,rstSuma,rstpromedio;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        num1= leer.nextFloat();
        System.out.println("ingrese el segundo numero:");
        num2= leer.nextFloat();
        rstSuma=num1+num2;
        rstpromedio=(num1+num2)/2;
        System.out.println("la suma de ambos numeros es: " + rstSuma + " y el promedio es: " + rstpromedio);


    }

}
