public class Task01 {

    public static void changeNumber(int a, int b){
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("A is equal to: " + a);
        System.out.println("B is equal to: " + b);

    }
    public static void main(String[] args) {
         /**Enunciado: Modificar el codigo de este ejemplo para que la salida por pannalla sea
         * "a = 10" y "b = 5". No se puede alterar las lineas de impresión por pantalla y realizar una
         * asignacion literal.
         */
        changeNumber(5, 10);
    }
}
