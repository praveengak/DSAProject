package BasicProblem;
import java.util.*;

public class GreatestCommonDivisor {

    public void toFindGcd(int a, int b){
        int num;
        List<Integer> number = new ArrayList<>();
        if(a>b){
            num=a;
        }
        else{
            num=b;
        }

        for(int i=1;i<=num;i++){
            if(a%i==0 && b%i==0){
                number.add(i);
            }
        }

        System.out.println("GCD: "+number.get(number.size()-1));
    }


    public static void main(String[] args) {

    int a = 48;
    int b = 18;

    GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
    greatestCommonDivisor.toFindGcd(a,b);

    }
}
