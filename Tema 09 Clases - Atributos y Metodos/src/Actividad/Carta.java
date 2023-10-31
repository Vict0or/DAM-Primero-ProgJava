public class Carta {
    /**
     * Esta Clase representa una CARTA
     * @version
     * @autor Victor Rodriguez
     */
    private int numero;
    private char palo;

    // Constructor por DEFECTO
    public Carta(){
        numero = 0;
        palo = 0;
    }
    /**
     * Constructor por PARAMETROS
     * @param numero Valor del numero de la carta.
     * @param palo Valor del palo de la carta
     */
    public Carta(int numero, char palo){
        this.numero = numero;
        this.palo = palo;
    }
    /*
     * @return El Numero de la carta.
     */
    public int getNumero() {
        return numero;
    }
     /*
      * @param numero Establece el parametro Numero.
      */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * @return El Palo de la carta
     */
    public char getPalo() {
        return palo;
    }
    /**
     * 
     * @param palo Establece el parametro Palo
     */
    public void setPalo(char palo) {
        this.palo = palo;
    }
    /**
     * Metodo para asignar Palos y Numeros. Luego los mostrará.
     */
    public void mostrarCarta() {
        String palo = " ";
        String numero = " ";

        if (this.palo == 'C') { // Primero comprobamos y asignamos el Palo.
            palo = "CORAZONES";
        } else if (this.palo == 'P') {
            palo = "PICAS";
        } else if (this.palo == 'T') {
            palo = "TREBOLES";
        } else {
            palo = "ROMBO";
        }
        switch (this.numero) { // Comprobamos numeros "especiales"
            case 1:
                numero = "AS";
                break;
            case 11:
                numero = "JACK";
                break;
            case 12:
                numero = "QUEEN";
                break;
            case 13:
                numero = "KING";
        }

        if (this.numero == 12) {
            System.out.println("Es la " + numero + " de " + palo + ". ");
        } else {
            if (this.numero == 1 || this.numero == 11 || this.numero == 13) {
                System.out.println("Es la " + numero + " de " + palo + ". ");
            } else {
                System.out.println("Es la " + this.numero + " de " + palo + ". ");
            }
        }
    }
    /**
     * Compara dos cartas para ver cual es mayor
     * @param c Carta con la que haremos la comparacion
     * @return El valor si la carta con la que compramos es menor, igual o mayor (-1,0,1)
     */
    public int compararCarta(Carta c) {
        if (this.numero > c.getNumero()) {
            return 1;
        } else if (this.numero < c.getNumero()) {
            return -1;
            //Si tienen los mismos numeros comparamos los Palos.
        } else {
            if (this.palo == c.palo) {
                return 0;
            } else if (this.palo > c.getPalo()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}