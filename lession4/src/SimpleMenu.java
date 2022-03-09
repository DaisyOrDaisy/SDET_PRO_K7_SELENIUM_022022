import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Double> arr= new ArrayList<Double>();
        while (true){
            System.out.println("___________Simple Menu____________\n1. Add number into list\n2. Print numbers\nYour choice: ");
            int choice1=scanner.nextInt();
            switch (choice1){
                case 1:
                    System.out.println("Input your number: ");
                    arr.add(scanner.nextDouble());
                    System.out.println(arr);
                    break;
                case 2:
                    if(arr.isEmpty()||arr==null)
                        System.out.println("Your arraylist is empty or null!\n");
                    else{
                        System.out.println("3. Get maximum number \n4. Get minimum number\n");
                        int choice2=scanner.nextInt();
                        if(choice2==3)
                            System.out.println("Maximum number is : "+ maxArr(arr));
                        else if(choice2==4)
                            System.out.println("Minimum number is : "+minArr(arr));
                        else
                            System.out.println("Your choice is invalid!");
                    }
                    break;
                default:
                    System.out.println("Your choice is invalid! You must choose option 1 or option 2...\n");



            }
        }

    }

    public static Double minArr(ArrayList<Double> array){
            Double min=array.get(0);
            for(Double i: array){
                if(i<min) min=i;
            }
            return min;
    }
    public static Double maxArr(ArrayList<Double> array){
        Double max=array.get(0);
        for(Double i: array){
            if(i>max) max=i;
        }
        return max;
    }
}
