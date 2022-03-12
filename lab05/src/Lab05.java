import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab05 {

    public static void main(String[] args) {
        Map<Integer, String> studentList = new HashMap<Integer,String>();
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("----------------------Simple menu---------------------------\n1. Input student info\n" +
                    "2. Find Student by ID\n" +
                    "0. Exit!");
            switch (scanner.nextInt()){
                case 1:
                    inputStudentInform(studentList);
                    break;
                case 2:
                    System.out.println("Input ID to find student:");
                    findStudentById(scanner.nextInt(),studentList);
                    break;
                case 0:
                    System.out.println("exit program! ");
                    flag=false;
                    break;
                default:
            }
        }
    }
    public static void findStudentById(Integer id, Map<Integer,String> list){
        String Name= list.get(id);
        if(Name!= null)
            System.out.printf("[%s,%d]\n",Name,id);
        else
            System.out.printf("Student with ID %d not found\n",id);

    }
    public static void inputStudentInform(Map<Integer,String> list){
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Input Student Name: ");
        String Name=scanner1.nextLine();
        System.out.println("Input Student ID: ");
        Integer ID = scanner1.nextInt();
        // the id must be unique
        while(list.get(ID)!=null){
            System.out.println("the ID is already exists, please enter another ID!");
            ID = scanner1.nextInt();

        }
        list.put(ID,Name);

    }

}

