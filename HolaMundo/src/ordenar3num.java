import java.util.Scanner;

public class ordenar3num {
    public static void main(String[] args) {
    /*
    escribe un programa que solicite ingresar 3 numeros, debe utilizar sentencias if-else para determinar y mostrar
    los numeros en orden ascendente
     */
        Scanner leer= new Scanner(System.in);
        System.out.print("ingresar 1er numero: ");
        int num= leer.nextInt();
        System.out.print("ingresar do numero: ");
        int num2= leer.nextInt();
        System.out.print("ingresar do numero: ");
        int num3= leer.nextInt();

        if (num <= num2 && num <= num3)  {
            if (num2 <= num3) {
                System.out.println("los num es orden ascendente: " + num + "-" + num2 + "-" + num3);
            }  else {
                System.out.println("Los números en orden ascendente son: " + num + "-" + num3 + "-" + num2);
            }
        } else if (num2 <= num && num2 <= num3) {
            if (num <= num3) {
                System.out.println("Los números en orden ascendente son: " + num2 + "-" + num + "-" + num3);
            } else {
                System.out.println("Los números en orden ascendente son: " + num2 + "-" + num3 + "-" + num);
            }
        } else {
            if (num <= num2) {
                System.out.println("Los números en orden ascendente son: " + num3 + "-" + num + "-" + num2);
            } else {
                System.out.println("Los números en orden ascendente son: " + num3 + "-" + num2 + "-" + num);
            }
        }
    }
}


