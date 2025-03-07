package BasicProblem;

public class LeapYear {

    /*
    TODO
    Leap year is Divisible by  4
    Not Divible by 100 but leapyear is divisible by 400
    2000 is divisble by 100 and also divisible by 400
    1900 is not a leap year
     */
    public void toFindLeapYear(int year){
        if(year%4==0){
            if(year%400==0){
                System.out.println(year+" is a leap Year");
            } else if (year%100==0){
                System.out.println(year+" is not a leap year");
            }
            else{
                System.out.println(year+" is a leap Year");
            }
        }
        else{
            System.out.println(year+" is not a leap Year");
        }
    }

    public static void main(String[] args) {
        int year = 2021;
        LeapYear leapYear = new LeapYear();
        leapYear.toFindLeapYear(year);
    }
}
