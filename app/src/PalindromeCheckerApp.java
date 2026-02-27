//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String str = sc.nextLine();

        String reversed = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }


        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }

        sc.close();
        }
    }
