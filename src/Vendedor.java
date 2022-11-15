import java.util.Date;

public class Vendedor {
    private String name;
   private Articulos articulo;
    private Date fechaEntrega;
    private boolean reservado;
    private int cantidadCuotas;
    private Cliente cliente;
    private double montoFinal;


    public void venta(int cantidadCuotas, Cliente cliente, Articulos articulo){//me hace venta,

        this.setArticulo(articulo);
        this.setCliente(cliente);
        this.articulo.getName();
        this.setCantidadCuotas(cantidadCuotas);
        this.setMontoFinal(this.articulo.getPrecio()/this.getCantidadCuotas());
        this.getFechaEntrega();

        if (this.getCliente().getBilletera()!=this.getMontoFinal()) return; // me hace la compra pero no regresa si no tengo el monto permitido
    }
    Vendedor(String name){
        this.setName(name);

    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setArticulo(Articulos articulo) {
        this.articulo = articulo;
    }
    public Articulos getArticulo() {
        return articulo;
    }


    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }
    public double getMontoFinal() {
        return montoFinal;
    }
}
