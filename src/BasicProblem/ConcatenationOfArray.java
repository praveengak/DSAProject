package BasicProblem;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int count =(nums.length)*2;
        int[] arr = new int[count];

        for(int i =0; i<nums.length; i++){
            for(int j = i; j==i;j++){
                arr[j]=nums[i];
                arr[nums.length+j]=nums[i];
            }
        }

        return arr;
    }

    /*
    Optimization approach  use modulus approach
     */

    public int[] getConcatenationApproach2(int[] nums){

        int n = nums.length;
        int[] arr = new int[n*2];
        for(int i =0;i<arr.length;i++){
            arr[i]=nums[i%n];
        }
        return arr;
    }

    public static void main(String[] args) {
         int[] arr = new int[]{1,2,1};

         ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
         concatenationOfArray.getConcatenation(arr);
    }
}
