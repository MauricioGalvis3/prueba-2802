        //Se ingresa por teclado un valor entero,
//mostrar una leyenda que indique si el número es positivo,
//negativo o nulo (es decir cero)
import java.util.Scanner;



public class NumNulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("ingresa un numero entero ");
        int num = input.nextInt();
        
        
        if (num > 0 ){
            System.out.println("el numero es positivo");

        }
        if ( num < 0 ){
            System.out.println("el numero es negativo");
        }
        if (num == 0 ) {
            System.out.println("el numero es nulo ");
        }
        input.close();
        
        
    }
    
}
