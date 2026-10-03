import java.util.HashMap;
public class MyInfo {
    public static void main(String[] args) {
        
        HashMap<String, String> person = new HashMap<>();

        person.put("Name", "Thieng vanntham");
        person.put("Age", "20");
        person.put("City", "New York");
        person.put("University", "Norton");
        person.put("Major", "SOftware Development");
        person.put("Language", "Java");
        person.put("Role", "Back-End Developer");

        for (String key : person.keySet()) {
            System.out.println(key + " : " + person.get(key));
        }
    }
}
