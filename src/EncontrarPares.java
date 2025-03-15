import  java.util.Scanner;

public class EncontrarPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número del rango: ");
        int Inicio = input.nextInt();

        if (Inicio <= 0) {
            System.out.println("El número ingresado no es positivo");
            input.close();
            return;
        }

        System.out.println("Ingrese el último número del rango: ");
        int Fin = input.nextInt();

        if (Fin <= 0) {
            System.out.println("El número ingresado no es positivo");
            input.close();
            return;
        }

        if (Inicio > Fin) {
            System.out.println("El rango no es válido, el primer número debe ser menor o igual al segundo.");
            input.close();
            return;
        }
            System.out.println("el rango va desde :  "+ Inicio + " hasta : " + Fin);

        int contPrimos= 0 ;
        for(int i= Inicio; i <= Fin ; i++){
             if (i % 2 == 1|| i == 2  ){
                System.out.println("el numero "+ i + " es primo ");
                contPrimos += 1;
             }
        }
        if (i% 2 ==1 ){
            contPrimos +=1 ;
        }
        System.out.println(contPrimos);
        input.close();
        System.out.println("hay "+ (int) (math.floor(contPrimos/2 ))+ "pares de primos en total ");
        
        
    }
}
