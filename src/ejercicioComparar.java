import java.util.Scanner;

public class ejercicioComparar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa 3 numeros ");
        byte num1 = scanner.nextByte();
        byte num2 = scanner.nextByte();
        byte num3 = scanner.nextByte();

        boolean resultado = (num1 > num2) && (num1<num3 );
        System.out.println("si decimos que el numero 1 es mayor que el segundo y menor que el tercero , esta afirmacion es : "+ resultado);


        scanner.close();
    }
}
