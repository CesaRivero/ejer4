import java.util.Date;

public class Venta {
    private Articulo articulo;
    private Date fechaEntrega;
    private boolean reservado;
    private int cantidadCuotas;
    private Cliente cliente;
    private double montoFinal;
    private Vendedor vendedor;

  Venta(int cantidadCuotas, Cliente cliente, Articulo articulo,Vendedor vendedor){//me hace venta,

        this.setArticulo(articulo);
        this.setCliente(cliente);
        this.articulo.getName();
        this.setCantidadCuotas(cantidadCuotas);
        this.setMontoFinal(this.articulo.getPrecio()/this.getCantidadCuotas());
        this.getFechaEntrega();

    }
    public boolean verificarVenta(){
        if (this.getCliente().getBilletera()<this.getMontoFinal())
            return false;
        else return true;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public Articulo getArticulo() {
        return articulo;
    }


    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }
    public double getMontoFinal() {
        return montoFinal;
    }
}
