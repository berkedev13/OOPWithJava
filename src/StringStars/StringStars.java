package StringStars;

import java.util.Scanner;
public class StringStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = input.nextLine();
        int stringLength = word.length();
        for (int i = 0; i < stringLength; i++) {
            if (i != stringLength - 1)
                System.out.print(word.charAt(i) + "*");
            else
                System.out.println(word.charAt(i));
        }
    }
}
