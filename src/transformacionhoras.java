import java.util.Scanner;
public class transformacionhoras {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese una hora en formato HH:MM (24 h)");
        String entrada = input.nextLine();
        System.out.println("la hora ingresada es : " + entrada );
        input.close();

        if (entrada.length() != 5 || entrada.charAt(2) != ':'){
            System.out.println("formato no valido");
            return;
        }
    
    char h1 = entrada.charAt(0);
    char h2 = entrada.charAt(1);
    char m1 = entrada.charAt(3);
    char m2 = entrada.charAt(4);

        // Convertir los caracteres a números
        int horas = (h1 - '0') * 10 + (h2 - '0');
        int minutos = (m1 - '0') * 10 + (m2 - '0');

        // Mostrar el resultado
        System.out.println(horas + ":" + minutos);

    }
}
                                 