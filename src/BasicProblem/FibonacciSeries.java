package BasicProblem;

import java.util.Scanner;
import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    int a = 0;
    int b =1;
    int sum;
//    System.out.println(b);
//    System.out.println(a);

    System.out.println("Enter the number of fib series: ");
    int n = scanner.nextInt();
    System.out.println(a);
    for(int i = 0; i<n;i++){
        System.out.println(b);
        sum=a+b;
        a=b;
        b=sum;

    }

    }

}
