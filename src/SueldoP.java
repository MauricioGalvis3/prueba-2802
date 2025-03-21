
                        //Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
//mensaje en pantalla indicando que debe abonar impuestos.

import java.util.Scanner;
public class SueldoP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("debes abonar impuestos? , ingresa tu sueldo ");
        int sueldo = input.nextInt();
        if (sueldo > 3000 ){
            System.out.println("debe declarar impuestos ");
        }
        else { 
            System.out.println("usted no debe declarar una monda");
        }












        input.close();
        
    }
    
}
