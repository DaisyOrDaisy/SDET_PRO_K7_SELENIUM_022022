package lab03;

public class FindMinMax {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        System.out.printf("Maximum of Array is %d\n",findMax(intArr));
        System.out.printf("Minimum of Array is %d\n",findMin(intArr));

    }
    public static int findMax(int[] arr){
        int max=arr[0];
        for(int i:arr){
            if(i>max)
                max=i;
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i:arr){
            if(i<min)
                min=i;
        }
        return min;
    }
}
