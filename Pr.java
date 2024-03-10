import java.util.Scanner;

public class Pr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = obj.nextLine();

        String newSentence = removeContinousCDG(sentence);
        System.out.println("New sentence: " + newSentence);
    }

    public static String removeContinousCDG(String sentence) {
        StringBuilder sb = new StringBuilder();
        char[] chars = sentence.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'c' && i + 2 < chars.length && chars[i + 1] == 'd' && chars[i + 2] == 'g') {
                i += 2; // Skip 'c', 'd', and 'g'
            } else {
                sb.append(chars[i]);
            }
        }

        return sb.toString();
    }
}
