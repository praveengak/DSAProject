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
    public void toFindArmStrongNumber(int num) {

        String str = String.valueOf(num);
        int count = str.length();
        int x = num;
        int quotient;
        int remainder;
        int sum = 0;
        do {
            quotient = x / 10;
            remainder = x % 10;
            x=quotient;
            if (quotient >=1 || quotient ==0) {
                sum = (int) (Math.pow(remainder, count) + sum);
            }
        } while (remainder > 0);

        if (sum == num) {
            System.out.println(num + " is a ArmStrongNumber");
        } else {
            System.out.println(num + " is not a ArmStrongNumber");
        }


    }

    public static void main(String[] args) {
        int num = 151;
        ArmStrongNumber armStrongNumber = new ArmStrongNumber();
        armStrongNumber.toFindArmStrongNumber(num);
    }
}
