package lab02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input weight: ");
        float weight=scanner.nextFloat();
        System.out.println("input height: ");
        float height=scanner.nextFloat();
        float bmi=weight/(height*2);
        bmi= (float) (Math.round(bmi*10.0)/10.0);
        //System.out.println(bmi);
        if(bmi<18.5)
            System.out.println("Underweight!");
        else if(bmi>=18.5 && bmi<=24.9)
            System.out.println("Normal weight!");
        else if(bmi>=25&&bmi<=29.9)
            System.out.println("Overweight!");
        else
            System.out.println("Obesity!");

    }
}
