import java.util.Scanner;
public class EjemploJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("ingresa tu altura");
        double altura = scanner.nextDouble();

        System.out.print("Hola, " + nombre + ". Tienes " + edad + " años." + " y tienes una altura de " + altura + " metros");

        scanner.close();
    }
}
