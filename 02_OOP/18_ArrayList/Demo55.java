import java.util.ArrayList;
import java.util.Collections;
public class Demo55 {
    public static void main(String[] args) {

        // 56.ArrayList = A resizable array. Elements can be added and removed after compilation phase.
        //                store reference data types.
        //                Array are fixes size, nut ArrayList can change.

//      ArrayList<Integer> number = new ArrayList<>();
//      ArrayList<Double> list = new ArrayList<>();
        ArrayList<String> heros = new ArrayList<>();

        heros.add("Iron Man");
        heros.add("Spider Man");
        heros.add("Super Man");

        //hero.remove(0); // remove element at index 0
        //hero.set(0, "Captain America"); // replace element at index 0
        
        //System.out.println(heros.get(0)); // get element at index 0
        //System.out.println(heros.size()); // get the size of the ArrayList "3" element 

        Collections.sort(heros); // sort the ArrayList in ascending order

        for(String hero: heros)
        {
            System.out.println(hero);
        }
    }
}
