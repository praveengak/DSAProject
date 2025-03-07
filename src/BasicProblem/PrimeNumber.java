package BasicProblem;


import java.util.Scanner;

public class PrimeNumber {
    Scanner sc = new Scanner(System.in);

    public void findPrimeNumber(int a){
        int count =0;
        int x = a/2;
        System.out.println(x);
        for(int i =x; i>=1;i--) {
            if (a % i == 0) {
                count++;
            }
        }
         if(count==1){
             System.out.println(a+" number is a prime number");
         }
         else{
             System.out.println(a+" number is a not prime number");
         }


    }

    public static void main(String[] args){
         int num = 11;

         PrimeNumber primeNumber = new PrimeNumber();
         primeNumber.findPrimeNumber(num);

    }
}
