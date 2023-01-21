import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExamples {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");

        Iterator<String> it = cars.iterator();

//        System.out.println(it.next());

//        for (int i = 0; i < cars.size(); i++){
//            System.out.println(it.next());
//        }


        while (it.hasNext()){
            System.out.println(it.next());
        }



        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(15);
        numbers.add(1);
        numbers.add(32);

        Iterator<Integer> iteratorNumber = numbers.iterator();

        while (iteratorNumber.hasNext()){
            Integer i = iteratorNumber.next();

            if (i < 10){
                iteratorNumber.remove();
            }
        }
        System.out.println(numbers);
    }
}
