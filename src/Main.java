public class Main {
    public static void main(String[] args) {
        Articulo silla=new Articulo("Primera silla",100);
        Articulo mesa=new Articulo("Primera mesa",200);
        Articulo televisor=new Articulo("Primer TV",300);

        Vendedor vendedor1=new Vendedor("Julio");
        Cliente cliente1=new Cliente("Cesar",50);
        Venta venta1=new Venta(1,cliente1,silla,vendedor1);

        vendedor1.vender(cliente1,silla);

       // System.out.println(String.format("Articulo comprado: %s \nMonto a pagar: %f\nVendido por:%s\nComprado por:%s",venta1.getArticulo().getName(),vendedor1.getMontoFinal(),vendedor1.getName(),vendedor1.getCliente().getName()));//





    }
}
