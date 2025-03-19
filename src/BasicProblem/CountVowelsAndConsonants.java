package BasicProblem;

import java.util.Scanner;

public class CountVowelsAndConsonants {

    public void toCountVowelsAndConsonants(String words){
        int count = words.length();
        System.out.println("Lenght of words: "+count);
        char[] vowels = {'a','e','i','o','u'};
        int vowelWords=0;
        int consonants=0;

        for(int i=0;i<count;i++){
            for(int j=0;j<5;j++){
                if(words.charAt(i) == vowels[j]){
                    vowelWords+=1;
                }
            }
        }

        consonants = count - vowelWords;
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
