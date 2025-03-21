/*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la 
cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
*/
import java.util.Scanner;
public class Capacitacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Nivel máximo:\tPorcentaje>=90%.\r\n" + 
                        "\tNivel medio:\tPorcentaje>=75% y <90%.\r\n" + 
                        "\tNivel regular:\tPorcentaje>=50% y <75%.\r\n" + 
                        "\tFuera de nivel:\tPorcentaje<50%.");

        System.out.println(" cuantas preguntas le realizaron ? ");
        int preguntas = input.nextInt();
        System.out.println("cuantas respondio correctamente? ");
        int preguntasCorrectas = input.nextInt();

        double porcentaje = (double) ( preguntasCorrectas)/ preguntas * 100;

        System.out.println("tu porcentaje fue de : " + porcentaje + "% ");
        
         
        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }



        input.close();
        
    }
    
}
