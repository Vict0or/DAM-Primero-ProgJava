public class Presupuesto {
    /**
     * Clase Padre
     * @version 1.0
     * @author Victor R
     */

    private String cliente, descripcion;
    private double importe;

    public Presupuesto(){      // Defecto
        cliente = " ";
        descripcion = " ";
        importe = 0;
    }
    public Presupuesto(String cliente, String descripcion, Double importe){
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.importe = importe;
    }
    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }
    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }
    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * Metodo para imprimir un Presupuesto
     */
    public void imprimirPresupuesto(){
        System.out.println("Cliente: " + cliente);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Importe: " + importe);
    }
}          
