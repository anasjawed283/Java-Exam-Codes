/*next word should start at the same letter previous word ended*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Antakshari {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the starting word:");
            String startingWord = obj.nextLine();
            words.add(startingWord);

            while (true) {
                System.out.println("Enter a word:");
                String word = obj.nextLine();

                if (word.isEmpty()) {
                    break;
                }
                if (word.charAt(0) != words.get(words.size() - 1).charAt(words.get(words.size() - 1).length() - 1)) {
                    System.out.println("Invalid word! The word should start with the last letter of the previous word.");
                    continue;
                }

                words.add(word);
            }
        }

        System.out.println("Actual chain of words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
