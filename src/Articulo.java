import java.util.Date;

public class Articulo {
    private String name;
    private double precio;

    Articulo(String name, double precio) {
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
