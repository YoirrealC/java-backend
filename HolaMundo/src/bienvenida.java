import java.util.Scanner;

public class bienvenida {
    public static void main(String[] args) {
        //Pedir al usuario nombre y apellido, darle la bienvenida la curso de JAVA.


        String nombre, apellido;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese su nombre por favor: ");
        nombre=leer.nextLine();
        System.out.println("ingrese su apellido por favor: ");
        apellido=leer.nextLine();
        System.out.println("bienvenido " + nombre + " - " + apellido + " ! ");

    }
}
