package BasicProblem;

import java.util.Scanner;

public class StarCodePattern {

    public void rightAngleTriangle(int layer){
        for(int i =0;i<layer;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void reverseRightAngleTriangle(int layer){
        for(int i =0;i<layer;i++){
            for(int j =0;j<=layer-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many layer of pattern needed: ");
        int layer = scanner.nextInt();

        StarCodePattern starCodePattern = new StarCodePattern();

//        starCodePattern.rightAngleTriangle(layer);

        starCodePattern.reverseRightAngleTriangle(layer);


    }
}
