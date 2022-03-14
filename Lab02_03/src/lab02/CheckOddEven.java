package lab02;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println("Input an Integer number: ");
        int input=new Scanner(System.in).nextInt();
        if(input%2==0)
            System.out.println("this is an even number !");
        else
            System.out.println("this is an odd number !");
    }
}
