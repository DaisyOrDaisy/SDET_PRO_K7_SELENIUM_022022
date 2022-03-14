package lab03;

public class CountOddEven {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        countOddEven(intArr);
    }
    public static void countOddEven(int[] arr){
        int numOdd=0,numEven=0;
        for(int i:arr){
            if(i%2==0)
                numEven++;
            else
                numOdd++;
        }
        System.out.printf("number of even number: %d\n",numEven);
        System.out.printf("number of odd number: %d\n",numOdd);

    }
}
