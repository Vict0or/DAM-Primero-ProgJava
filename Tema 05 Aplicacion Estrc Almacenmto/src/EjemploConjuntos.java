import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploConjuntos {
    public static void main(String[] args) {
        //HashSet
        Set <Integer> hasSet = new HashSet<>();
        for (int i = 0; i < 100000; i++){
            hasSet.add(i);                 //Creamos, rellenamo e imprimimos un HASHSET.
        }
        System.out.println(hasSet);

        //Treeset
        Set<Integer> treeset = new TreeSet<>();
        for (int i = 0; i < 100000; i++){
            treeset.add(i);                 //Creamos, rellenamo e imprimimos un TREESET.
        }
        System.out.println(treeset);

        //LinkedHashSet
        Set <Integer>linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 100000; i++){
            linkedHashSet.add(i);                 //Creamos, rellenamo e imprimimos un LinkedHashSet.
        }
        System.out.println(linkedHashSet);
    }
}
