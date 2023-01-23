import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();

        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);

        //pushing elements into stack
        stk.push(12);
        stk.push(24);
        stk.push(10);
        stk.push(5);

        while (!stk.isEmpty()){
            stk.pop();
        }

        System.out.println("Elements in Stack: " + stk);


    }
}
