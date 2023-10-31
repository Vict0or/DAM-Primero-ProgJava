package Actividad02;

public abstract class Vehiculo {
    // Atributos
    String matricula;
    int alquilerD;

    // Constructor por Defecto
    public Vehiculo(){
        matricula = " ";
        alquilerD = 0;
    }
    /**
     * Constructor por Parametros
     * @param matricula
     * @param alquilerD
     */
    public Vehiculo(String matricula, int alquilerD){
        this.matricula = matricula;
        this.alquilerD = alquilerD;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getAlquilerD() {
        return alquilerD;
    }
    public void setAlquilerD(int alquilerD) {
        this.alquilerD = alquilerD;
    }
    //Metodos ABSTRACTOS para implementacion en Clases.
    public abstract double importeAlquiler();
    public abstract void mostrarRecibo();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", alquilerD=" + alquilerD +
                '}';
    }
}
