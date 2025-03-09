package BasicProblem;


import java.util.Scanner;

public class PalindromeNumber {

    public void toCheckPalindrome(int num) {
        String value = String.valueOf(num);
        int length = value.length();
        String value2 = "";
        for (int i = length - 1; i >= 0; i--) {
            value2 +=  value.charAt(i);
        }

        if(value.equals(value2)){
            System.out.println(num+" is a palindrome Number");
        }
        else{
            System.out.println(num+" is not a palindrome number");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scanner.nextInt();
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        palindromeNumber.toCheckPalindrome(num);


    }
}
