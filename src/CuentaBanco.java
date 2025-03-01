public class CuentaBanco {

    public static void main(String[] args) {
        double CantidadDinero = 1000;
        int CantidadRetiro = 200;
        final byte NUM_SEMANA = 4;
        double saldoFinal= CantidadDinero - (CantidadRetiro*NUM_SEMANA);
        System.out.println("el saldo final es  : " + saldoFinal);
    }
}