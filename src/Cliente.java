import java.util.ArrayList;

public class Cliente {
    private String name;
    private ArrayList<Articulo> articulo;
    private double billetera;

    Cliente(String name,double billetera){
        this.setBilletera(billetera);
        this.setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Articulo> addArticulo(Articulo articulo) {
        this.articulo.add(articulo);
        return this.articulo;

    }


    public double getBilletera() {
        return billetera;
    }

    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }
}
