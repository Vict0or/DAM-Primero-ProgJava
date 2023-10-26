
import java.util.*;

public class EjLinkedList {
    public static void main(String[] args) {
        
        //Declaramos un elemento de tipo COLECCION de tipo lista: LinkedList.
        LinkedList <Integer> lista = new LinkedList<>();

        //Añadimos elemntos a traves de su metodo .add()
        for (int i = 0; i < 10; i++){
            lista.add(i);
        }
        System.out.println(lista);
        System.out.println(lista.contains(5));
        lista.remove(4);
        System.out.println(lista);
    }
    
}
