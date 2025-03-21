//Realizar un programa que solicite ingresar
//dos números distintos y muestre por pantalla el mayor de ellos.

import java.util.Scanner;


public class MayorNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el primer numero ");
        int num1 = input.nextInt();
        System.out.println("INGRESA EL NUMERO 2 ");
        int num2 = input.nextInt();
        if (num1 > num2 ){
            System.out.println("el numero 1 es mayor : "+ num1 );
        }
        else { 
            System.out.println("el numero 2 es mayor");
        }
        input.close();
    }
    
}
