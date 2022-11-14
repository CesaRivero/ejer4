public class Vendedor {
    private String name;
    Articulos articulo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void venta(){
        this.articulo.getPrecio();
        this.articulo.getCantidadCuotas();
        this.articulo.getName();


    }
}
