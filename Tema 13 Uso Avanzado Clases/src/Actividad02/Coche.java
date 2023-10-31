package Actividad02;

public class Coche extends Vehiculo{
    // Atributo
    private int plazasCoche;

    public Coche(){
        super();
        plazasCoche = 0;
    }
    public Coche(String matricula, int alquilerD, int plazasCoche){
        super(matricula, alquilerD);
        this.plazasCoche = plazasCoche;
    }
    @Override
    public double importeAlquiler(){
        return 50 * super.getAlquilerD() + (1.5 * plazasCoche * super.alquilerD);
    }
    @Override
    public void mostrarRecibo() {
        System.out.println("--------------------\n"
                + "COCHE\n"
                + "--------------------\n"
                + "Matricula: " + super.getMatricula() +"\n"
                + "Duracion: " + super.getAlquilerD() +"\n"
                + "Plazas: " + plazasCoche +"\n"
                + "Importe del alquiler: " + importeAlquiler());

    }
}
