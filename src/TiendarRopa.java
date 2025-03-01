public class TiendarRopa {
    public static void main(String[] args) {

       System.out.println("tienda  de ropa");
        //precios originales
        int precioCamisa =25000;
        int precioPantalon=30000;

        //descuento inicial por compra 
        double descuento =0.15 ;
        double PrecioCamisaDescuento =precioCamisa * (1 - descuento);
        double PrecioPantalonDescuento = precioPantalon * (1-descuento);

        System.out.println(" el valor de la camisa con el descuento : "+ PrecioCamisaDescuento);
        System.out.println(" el dvalor del pantalon con desceunto  es : "+ PrecioPantalonDescuento);
        double totalCYP = PrecioCamisaDescuento + PrecioPantalonDescuento;
        System.out.println(" total camisa y pantalon : "+ totalCYP );

        //desceunto al comprar una segunda camiseta
        double descuentoS2= 0.05 ;
        double descuentoSegundaC =PrecioCamisaDescuento * (1- descuentoS2);
        double  totalCamisas = descuentoSegundaC + PrecioCamisaDescuento;
        System.out.println("al comprar dos camisas el valor seria : "+ totalCamisas);

   }
    
}
