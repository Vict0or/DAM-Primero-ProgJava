public class Practica01 {
    public static void main(String[] args) {
        //Declaracion e Inicialización de una Matriz/Array
        int[] miarray = new int[5]; //Declaracion

        //Inicializacion
        miarray[0] = 5;
        miarray[1] = 7;
        miarray[2] = 6;
        miarray[3] = 74;
        miarray[4] = 56;

        //Lo mostramos con un iteracion FOR
        for (int i = 0; i < miarray.length; i++){
            System.out.println(miarray[i] + " ");
        }
    }
}
