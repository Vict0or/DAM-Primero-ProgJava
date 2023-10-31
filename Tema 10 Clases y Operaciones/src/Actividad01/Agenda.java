package Actividad01;

public class Agenda {
    /**
     * Crea la clase llamada AGENDA. Esta clase contendra 5 atributos, de lunes a vienes de tipo
     * String donde se introducirán las tareas diarias.
     * @version 1.0
     * @author Victor
     */
    private String lunes, martes, miercoles, jueves, viernes;

    /**
     * Constructor por Defecto
     * @param propios de la clase.
     */
    public Agenda(){
        lunes = " ";
        martes = " ";
        miercoles = " ";
        jueves = " ";
        viernes = " ";
    }
    /**
     * Contructor por Parametros
     * @param lunes
     * @param martes
     * @param miercoles
     * @param jueves
     * @param viernes
     */
    public Agenda(String lunes, String martes, String miercoles, String jueves, String viernes) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
    }
    /**
     * Constructor por Copia
     */
    public Agenda(Agenda copia) {
        lunes = copia.lunes;
        martes = copia.martes;
        miercoles = copia.miercoles;
        jueves = copia.jueves;
        viernes = copia.viernes;
    }
    /**
     * @return the lunes
     */
    public String getLunes() {
        return lunes;
    }
    /**
     * @param lunes the lunes to set
     */
    public void setLunes(String lunes) {
        this.lunes = lunes;
    }
    /**
     * @return the martes
     */
    public String getMartes() {
        return martes;
    }
    /**
     * @param martes the martes to set
     */
    public void setMartes(String martes) {
        this.martes = martes;
    }
    /**
     * @return the miercoles
     */
    public String getMiercoles() {
        return miercoles;
    }
    /**
     * @param miercoles the miercoles to set
     */
    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }
    /**
     * @return the jueves
     */
    public String getJueves() {
        return jueves;
    }
    /**
     * @param jueves the jueves to set
     */
    public void setJueves(String jueves) {
        this.jueves = jueves;
    }
    /**
     * @return the viernes
     */
    public String getViernes() {
        return viernes;
    }
    /**
     * @param viernes the viernes to set
     */
    public void setViernes(String viernes) {
        this.viernes = viernes;
    }
    @Override
    public String toString() {
        return "Agenda [lunes=" + lunes + ", martes=" + martes + ", miercoles=" + miercoles + ", jueves=" + jueves
                + ", viernes=" + viernes + "]";
    }
    
    public void mostrarDia(int dia){
        switch(dia){
            case 1: System.out.println(" El Lunes toca: " + this.lunes ); break;
            case 2: System.out.println(" El Lunes toca: " + this.martes ); break;
            case 3: System.out.println(" El Lunes toca: " + this.miercoles ); break; 
            case 4: System.out.println(" El Lunes toca: " + this.jueves ); break; 
            case 5: System.out.println(" El Lunes toca: " + this.viernes ); break ;
        }
    }
    
}
