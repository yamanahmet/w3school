import java.util.ArrayList;

public class CountWordsExamples {
    public static void main(String[] args) {
        String words = "one two three four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
