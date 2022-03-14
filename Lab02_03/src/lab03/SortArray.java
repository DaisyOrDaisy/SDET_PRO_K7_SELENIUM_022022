package lab03;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // lab03.3
        int[] arr={12, 34, 1, 16, 28};
        arr=mergeSort(arr);
        System.out.println("-------------Lab 3.3--------------\n" +
                "Sorted Array: "+Arrays.toString(arr));
        //lab03.4
        int[] arr1={1, 12, 16, 28, 34};
        int[] arr2={1, 13, 16, 27, 99};
        System.out.println("-------------Lab 3.4--------------\n" +
                "the result after merging 2 sorted array: "+Arrays.toString(mergeArr(arr1,arr2)));
    }
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int pivot=array.length/2;
        int[] left = Arrays.copyOfRange(array, 0, pivot);
        int[] right = Arrays.copyOfRange(array, pivot, array.length);

        int[] R = mergeSort(right);
        int[] L = mergeSort(left);
        array=mergeArr(L,R);
        return array;
    }
    public static int[] mergeArr(int[] arrLeft,int[] arrRight){
        int[] result = new int[arrLeft.length+arrRight.length];
        int i = 0, j = 0, k = 0;
        while (i < arrRight.length && j < arrLeft.length) {
            if(arrRight[i]<arrLeft[j]) {
                result[k] = arrRight[i];
                i++;
            }
            else {
                result[k] = arrLeft[j];
                j++;
            }
            k++;
        }
        if (i < arrRight.length) {
            while (i < arrRight.length) {
                result[k] = arrRight[i];
                i++;
                k++;
            }
        }
        if (j < arrLeft.length) {
            while (j < arrLeft.length) {
                result[k] = arrLeft[j];
                j++;
                k++;
            }
        }
        return result;
    }
}
