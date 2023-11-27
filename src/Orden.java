public class Orden {
    private int idOrden;
    private String descripcionOrden;
    private double costo;
    private Date fechaOrden;
    private String estado;
    private Cliente cliente;
    private Categoria categoria;
    private Tecnico tecnico;

    public Orden(int idOrden, String descripcionOrden, double costo, Date fechaOrden, String estado, Cliente cliente, Categoria categoria, Tecnico tecnico) {
        this.idOrden = idOrden;
        this.descripcionOrden = descripcionOrden;
        this.costo = costo;
        this.fechaOrden = fechaOrden;
        this.estado = estado;
        this.cliente = cliente;
        this.categoria = categoria;
        this.tecnico = tecnico;
    }







}
