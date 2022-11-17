import java.util.ArrayList;
import java.util.Date;

public class Vendedor {
    private String name;
    private ArrayList<Venta> ventas;

    Vendedor(String name){
        this.setName(name);

    }
    public void addVenta(Venta venta){
        this.addVenta(venta);

    }
    public void vender(Cliente cliente , Articulo articulo){
        Venta venta=new Venta(1,cliente,articulo,this);
        if(venta.verificarVenta()){
            this.addVenta(venta);
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
