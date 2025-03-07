package BasicProblem;

/*
TODO
to find the given number is odd or even
 */
public class EvenOdd {

    public void findEvenOdd(int num){
        if(num%2==0){
            System.out.println(num+" is a even number");
        }
        else {
            System.out.println(num+" is a odd number");
        }

    }

    public static void main(String[] args){

        int num = 12;
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.findEvenOdd(num);

    }
}
