import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Mercedes");

        System.out.println(cars);

        for (String car : cars){
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));;
        }
    }
}
