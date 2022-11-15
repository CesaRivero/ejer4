import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articulos silla=new Articulos("Primera silla",100);
        Articulos mesa=new Articulos("Primera mesa",200);
        Articulos televisor=new Articulos("Primer TV",300);
        Vendedor vendedor1=new Vendedor("Julio");
        Cliente cliente1=new Cliente("Cesar",50);
        vendedor1.venta(1,cliente1,silla);
        System.out.println(String.format("Articulo comprado: %s \nMonto a pagar: %f\nVendido por:%s\nComprado por:%s",vendedor1.getArticulo().getName(),vendedor1.getMontoFinal(),vendedor1.getName(),vendedor1.getCliente().getName()));





    }
}
