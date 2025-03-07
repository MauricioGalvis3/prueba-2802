import java.util.Scanner;

public class MediaNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingresa 3 numeros ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        double media =  (num1+num2+num3)/3;
        System.out.println("la media de los 3 numeros es : " +media );






        scanner.close();
    }
    
}
