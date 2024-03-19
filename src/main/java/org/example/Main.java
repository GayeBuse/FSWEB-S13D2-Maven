package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false

        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false


        System.out.println(numberToWords(123)); // One Two Three
        System.out.println(numberToWords(1010)); // One Zero One Zero
        System.out.println(numberToWords(-12)); // Invalid Value
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
     return false;

        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            int digit = num % 10;
            result.insert(0, words[digit] + " ");
            num /= 10;
        }

        return result.toString().trim();
    }
}
