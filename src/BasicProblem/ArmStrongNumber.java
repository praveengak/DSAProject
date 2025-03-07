package BasicProblem;


public class ArmStrongNumber {

    /*
    Todo
    sum of it digits each raise to the power to the number of digits equal to the original
    number
    Ex:
    153
    (1^3)+(5^3)+(3^3) = 1+125+27 = 153
     */
    public void toFindArmStrongNumber(int num){

        String str = String.valueOf(num);
        int count = (int)(str.length());
        int quotient;
        int remainder;
        int sum=0;
        do{
        quotient = num/10;
        remainder = num%10;
        if(quotient>10){
        sum = (int)(Math.pow(remainder, count)+sum);}
        else{sum=(int)(Math.pow(quotient, count)+sum);}
        }while (remainder>0);

        if (sum==num){
            System.out.println(num+" is a ArmStrongNumbet");
        }
        else{System.out.println(num+" is not a ArmStrongNumbet");}


    }

    public static void main(String[] args) {
    int num = 153;
    ArmStrongNumber armStrongNumber = new ArmStrongNumber();
    armStrongNumber.toFindArmStrongNumber(num);
    }
}
