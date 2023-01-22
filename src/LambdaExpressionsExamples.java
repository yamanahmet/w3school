import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressionsExamples {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(12);
        numbers.add(24);

        //Use a lambda expression in the ArrayList's forEach() method to print every item in the list:
        numbers.forEach( (number) -> {
            System.out.println(number);
        });


        //Use Java's Consumer interface to store a lambda expression in a variable:
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}
