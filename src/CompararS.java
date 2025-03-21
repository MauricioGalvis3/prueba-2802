
                                        //Realizar un programa que solicite la carga por teclado de dos números,
                                        //si el primero es mayor al segundo informar su suma y diferencia,
                                        //en caso contrario informar el producto y la división
                                        //del primero respecto al segundo.
import java.util.Scanner;
public class CompararS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el primer numero");
        int Num1 = input.nextInt();
        System.out.println("ingresa el SEGUNDO numero");
        int Num2 = input.nextInt();

        if (Num1>Num2){
            int suma1 = Num1 + Num2;
            System.out.println("el valor de la suma es : "+ suma1);
            int resta1 = Num1 - Num2;
            System.out.println("la diferencia es : " + resta1);
        }
        else {
            int producto = Num2 * Num1 ;
            System.out.println( "el producto es : " + producto);
            double division = (Num2 / Num1) ;
            System.out.println("la division es igual  a : "+ division );
        
        }


    






        input.close();


    }
} 
