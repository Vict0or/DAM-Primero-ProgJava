public class Practica06 {
    public static boolean esPalindromo(String frase){
        boolean espalin = false;
        char[] aux = frase.toCharArray();
        char[] aux2 = new char [aux.length];

        //Rellenamos el segundo array con los caracteres en orden inverso
        int fin = frase.length()-1;     // Establecemos una variable con el final.
        for(int i = 0; i < aux.length; i++){
            aux2[i] = aux[fin];
            fin --;
        }
        // Comprobamos posiciones
        for(int i = 0; i < aux.length; i++)        {
            if(aux2[i] == aux[i]){
                espalin = true;
            }else{
                break;
            }
        }
        return espalin;
    }
    public static void main(String[] args) {
        String frase = "RADAR";


        if(esPalindromo(frase)){
            System.out.println("La palabra introducida es PALINDROMO");
        }else{
            System.out.println("La palabra introducida NO es PALINDROMO");
        }
    }
}
