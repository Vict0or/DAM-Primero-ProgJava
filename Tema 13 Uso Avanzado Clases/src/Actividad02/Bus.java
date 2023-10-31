package Actividad02;

public class Bus extends Vehiculo {
    private int plazasBus;
    
    public Bus(){
        super();
        plazasBus = 0;
    }

    public Bus(String matricula, int alquilerD, int plazasBus){
        super(matricula, alquilerD);
        this.plazasBus = plazasBus;
    }
    @Override
    public double importeAlquiler() {
        return 50 * super.getAlquilerD() + (1.5 * plazasBus * super.alquilerD) * (2 * plazasBus);
    }

    @Override
    public void mostrarRecibo() {
        System.out.println("--------------------"
                + "BUS\n"
                + "--------------------"
                + "Matricula: " + super.getMatricula() +"\n"
                + "Duracion: " + super.getAlquilerD() +"\n"
                + "Plazas: " + plazasBus +"\n"
                + "Importe del alquiler: " + importeAlquiler());
    }
}
