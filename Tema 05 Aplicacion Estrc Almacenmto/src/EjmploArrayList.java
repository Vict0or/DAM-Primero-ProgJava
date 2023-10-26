import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class EjmploArrayList {
    public static void main(String[] args) {
        // Declaracion
        ArrayList <Integer> lista = new ArrayList<>();

        // Generamos numeros aleatorios 
        Random generador = new Random();
        
        // Rellenamos el ArrayList
        for (int i = 0; i < 10; i++){
            lista.add(generador.nextInt(100));  // le damos n aleatorios de 0-100
        }

        // Imprimimos el Arraylist tal como ha sido creado
        System.out.println(lista);

        // Imprimimos ITERANDO con bucle y la clase ITERATOR
        Iterator <Integer> it = lista.iterator();
        while (it.hasNext()){
            int elemento = it.next();    // Iteramos mientras haya un next
            System.out.println(elemento + "\t");
        }
        System.out.println(" ");

        // EJempolo de FOR EACH
        for (int elemento : lista){
            System.out.print(elemento + " ");
        }
    }
}
