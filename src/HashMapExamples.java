import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Turkiye", "Ankara");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Turkiye"));
        capitalCities.replace("Norway", "Unnown");
        System.out.println(capitalCities.get("Norway"));
        System.out.println(capitalCities.size());

        for (String capitalCity : capitalCities.keySet()){
            System.out.println(capitalCity);
        }

        for (String capitalCity : capitalCities.keySet()){
            System.out.println("key: " + capitalCity + " Value: " + capitalCities.get(capitalCity));
        }
    }
}
