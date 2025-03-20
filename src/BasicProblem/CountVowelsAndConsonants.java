package BasicProblem;

import java.util.Scanner;
import java.util.Set;

public class CountVowelsAndConsonants {

    public void toCountVowelsAndConsonants(String words){

        Set<Character> vowels = Set.of('a','e','i','o','u');
        int vowelWords=0;
        int consonants=0;

        for(char ch : words.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                if(vowels.contains(ch)){
                    vowelWords+=1;
                }
                else{
                    consonants+=1;
                }
            }
        }

        System.out.println("Number of vowels: "+vowelWords);
        System.out.println("Number of consonants: "+consonants);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String words = scanner.nextLine();

        CountVowelsAndConsonants countVowelsAndConsonants = new CountVowelsAndConsonants();

        countVowelsAndConsonants.toCountVowelsAndConsonants(words);

    }
}
