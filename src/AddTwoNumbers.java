import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int number1, number2, sum;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please entered first number: ");
        number1 = myObj.nextInt();

        System.out.println("Please entered second number: ");
        number2 = myObj.nextInt();

        sum = number1 + number2;
        System.out.println("Sum of two numbers: " + sum);
    }
}
