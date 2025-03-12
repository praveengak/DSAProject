package BasicProblem;

public class SeparateEvenAndOddNumber {

    public void separateEvenOddNumber(int[] num){
        int size = num.length;
        int j = 0;
        int k=0;
        int[] even = new int[size];
        int[] odd= new int[size];
        for(int i=0; i<size;i++){
            if(num[i]%2==0){
                even[j]=num[i];
                j++;
            }
            else{
                odd[k]=num[i];
                k++;
            }
        }

        System.out.println("Even array");
        for(int i = 0;i<even.length-k;i++){
            System.out.println(even[i]);
        }

        System.out.println("Odd array");
        for(int i = 0;i<odd.length-j;i++){
            System.out.println(odd[i]);
        }

    }

    public static void main(String[] args) {
        int[] num = {4, 8, 15, 16, 23, 42};

        SeparateEvenAndOddNumber separateEvenAndOddNumber = new SeparateEvenAndOddNumber();
        separateEvenAndOddNumber.separateEvenOddNumber(num);

    }
}
