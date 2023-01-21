import java.util.HashSet;

public class HashSetExamples {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");
//        cars.add("Jaguar");
        cars.add("Tesla");

        if (cars.contains("Jaguar") == false){
            cars.add("Jaguar");
            System.out.println("Added jaguar");
        }
        else{
            System.out.println("Jaguar already exists");
        }
    }
}
