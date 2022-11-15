import java.util.Date;

public class Articulos {
    private String name;
    private double precio;

    Articulos(String name, double precio) {
        this.setName(name);
        this.setPrecio(precio);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
