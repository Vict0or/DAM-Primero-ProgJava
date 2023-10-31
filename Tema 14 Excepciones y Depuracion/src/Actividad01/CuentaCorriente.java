package Actividad01;

public class CuentaCorriente {
    private double saldo;

    // Constructores
    public CuentaCorriente(){
        saldo = 0;
    }
    public CuentaCorriente(double saldo){
        this.saldo = saldo;
    }
    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Ingresa dinero en Cuenta Corriente
     * @param cantidad a ingresar.
     * @throws Exception Se producira al ingresar una cantidad negativa
     */
    public void ingresaDinero(double cantidad) throws Exception{
        if (cantidad < 0){
            throw new Exception ("No se puede ingresar en NEGATIVO");
        }
        saldo += cantidad;
    }
    /**
     * Retira dinero en cuenta Corriente
     * @param cantidad Cantidad a Retirar de la cuenta
     * @throws Exception Se producirá si la cantidad a retirar es negativa o si la
     * cantidad que tenmos en saldo es inferior a lo que queremos retirar.
     */
    public void retirarDinero(double cantidad) throws Exception{
        if(cantidad < 0 || getSaldo() < cantidad){
            throw new Exception("No se puede retirar una cantidad NEGATIVA");
        }
        saldo -= cantidad;
    }
    @Override
    public String toString() {
        return "CuentaCorriente [saldo=" + saldo + "]";
    }

}
