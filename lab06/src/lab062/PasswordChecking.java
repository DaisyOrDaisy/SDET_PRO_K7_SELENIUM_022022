package lab062;

import java.util.Scanner;

public class PasswordChecking {
    public static void main(String[] args) {
        //String myPassword = "password123",inputPassword;
        String myPassword=new String("password123");
        String inputPassword=new String();
        int times=1;
        boolean status=false;
        Scanner scanner=new Scanner(System.in);
        while (times<4 && status==false){
            System.out.printf("please input your password here: ");
            inputPassword=scanner.nextLine();
            if(inputPassword.equals(myPassword)){
                System.out.println("\ncorrect password !");
                status=true;
            }else {
                if(times==3)
                    System.out.println("your password is incorrect! you've been blocked ! ");
                else
                    System.out.printf("\nyour password is incorrect! you have %d turns left\n",(3-times));
                times++;
            }
        }
    }
}
