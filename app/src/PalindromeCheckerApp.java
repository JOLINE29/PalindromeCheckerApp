//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gut
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

        sc.close();
    }
}