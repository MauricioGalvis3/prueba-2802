//Confeccionar un programa que permita cargar un número entero positivo
//de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
//Mostrar un mensaje de error si el número de cifras es mayor.

import java.util.Scanner;

public class Num3ci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa un numero entero positivo (0-999)");
        int num = input.nextInt();
        if (num >= 0 && num < 1000){
            if (num < 10 ){
                System.out.println("el numero tiene una cifra");
            }
            if (num < 100 ){
                System.out.println("el numero tiene dos cifras");
            }
            if (num< 1000 && num > 99 ){
                System.out.println("El numero tiene 3 cifras");
            }

        }else {
            System.out.println("el numero no cumple la condicion ");
        }


        input.close();

    }
    
}
