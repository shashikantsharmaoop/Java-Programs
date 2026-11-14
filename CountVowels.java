import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence;
        int count = 0;

        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();

        for (int i = 0; i < sentence.length(); i++) {

            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Total Vowels = " + count);

        sc.close();
    }
}