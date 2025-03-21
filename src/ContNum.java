
//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos
//un número entero)
import java.util.Scanner;

public class ContNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("ingresa un numero positivo de uno o dos digitos(1..99 )");
            int num = input.nextInt();
            if (num > 0 && num < 100) {

                System.out.println("el numero ingresado cumple las condiciones");

                if (num < 10) {
                    System.out.println("el numero tiene una cifra ");

                } else {
                    System.out.println("el numero tiene dos cifras ");
                }
            } else {
                System.out.println("el numero ingresado no cumple ");
            }
        } while (false);

        input.close();


    }
}
