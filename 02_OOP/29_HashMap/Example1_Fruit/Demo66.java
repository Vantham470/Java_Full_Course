import java.util.HashMap;
public class Demo66 {
    public static void main (String[] args) {

        // 67. HanMap = A data structure that stores key-value paris
        //              Keys are unique, but values can be duplicate 
        //              Does not maintianly any order, but is memory efficient
        //              HashMap<Key, Value>

        HashMap<String, Double>  map = new HashMap<>();

        map.put("Apple", 0.55);
        map.put("Orange", 0.75);
        map.put("Banana", 0.25);
        map.put("Coconut", 1.00);

        // map.remove("Apple");
        // System.out.println(map.get("Apple"));
        // System.out.println(map.containsKey("Banana")); if banana have in element so output is true, if not = false.

        // if(map.containsKey("Durian")) {
        //    System.out.println(map.get("Durian"));
        //}
        //else {
        //    System.out.println("Key not found!");
        //}

        // System.out.println(map.containsValue(1.00)); // output = true.
        // System.out.println(map.size()); // ouput is 4.

        for(String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
         
        

    }
}