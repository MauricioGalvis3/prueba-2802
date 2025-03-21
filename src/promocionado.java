                //Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
//mostrar un mensaje "Promocionado".
import java.util.Scanner;
public class promocionado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese nota 1 :");
        float nota1 = input.nextFloat();

        System.out.println("ingrese nota 2 :");
        float nota2  = input.nextFloat();

        System.out.println("ingrese nota 3 :");
        float nota3 = input.nextFloat();




        float promedio = ((nota1+nota2+nota3)/ 3 );
        if ( promedio >= 7 ) {
            System.out.println("su promedio es de : "+ promedio + " usted fue promocionado");
        }
        else {
            System.out.println("su promedio fue : "+ promedio + " usted no fue promocionado");
        }
        input.close();
    }
}
