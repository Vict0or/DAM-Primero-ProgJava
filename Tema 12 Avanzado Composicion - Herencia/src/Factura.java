import java.math.BigDecimal;
import java.math.RoundingMode;

public class Factura extends Presupuesto{
    /**
     * Clase para describir una Factura
     * @author
     * @version 1.0
     */
    private final String fabricante;

    // Constructor heredado clase PADRE - POR DEFECTO
    public Factura(){
        super();
        fabricante = "Productos ACME SL";
    }

    // Constructor heredado Clase Padre - POR PARAMETROS
    public Factura(String cliente, String descripcion, double importe){
        super(cliente, descripcion, importe);
        fabricante = "Productos ACME SL";
    }
        //Constructor Propio de la clase Fabricante
        public Factura(String fabricante) {
            this.fabricante = fabricante;
        }

        /**
         * Metodo
         * @return Valor caculado del presupuesto + IVa
         */
        public double obtenerPrecioFinal(){
            double aux = (super.getImporte() * 0.21) + super.getImporte();
            BigDecimal db = new BigDecimal(aux).setScale(2, RoundingMode.HALF_UP);
            double precio = db.doubleValue();
            return precio;
        }
        @Override
        public void imprimirPresupuesto(){
            super.imprimirPresupuesto();
            System.out.println("Importe + IVA: " + obtenerPrecioFinal());
            System.out.println("Fabricante: " + fabricante);
        }
    }
