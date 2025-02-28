import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Welcome to suma!");
        System.out.println("ingresa un numero :");
        int numero1= input.nextInt();
        System.out.println( "Numero 1 es : " + numero1 );
        System.out.println("ingresa un numero :");
        int numero2= input.nextInt();
        System.out.println( "Numero 2 es : " + numero2 );

        int suma = numero1 + numero2;
        System.out.println("la suma de los dos numeros es  :"+ suma );
        input.close();

    }
}
