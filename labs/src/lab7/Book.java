package lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Book {
    String ISBN;
    String title;
    String authorName;
    Integer year;

    @Override
    public String toString(){
        return "found!\nISBN: "+this.ISBN+"\nTitle: "+this.title+"\nAuthor Name: "
                +this.authorName+"\nyear: "+this.year+"\n\n";
    }

    public static Book inputBook() {
        Scanner sn=new Scanner(System.in);
        Book b=new Book();
        System.out.println("Input ISBN: ");
        b.ISBN=sn.nextLine();
        System.out.println("Input Title: ");
        b.title=sn.nextLine();
        System.out.println("Input Author Name: ");
        b.authorName=sn.nextLine();
        System.out.println("Input year: ");
        try {
            b.year=sn.nextInt();
        }catch (InputMismatchException e){
            System.out.println("you must input a Integer number for year value..!");
        }
        return b;
    }

    public static boolean findBook(String key, ArrayList<Book> arr){
        boolean flag=false;
        for(int i=0;i<arr.size(); i++) {
            if (arr.get(i).ISBN.equals(key)) {
                System.out.println(arr.get(i));
                flag = true;
            }
        }
        return flag;
    }


    public static void main(String[] args) {

        int choice=3;
        Scanner scanner=new Scanner(System.in);
        ArrayList<Book> bookArrayList=new ArrayList<>();
        while (choice!=0){
            System.out.println("_________________________SIMPLE MENU_________________________\n1. Input book\n" +
                    "2. Find book by ISBN\n" +
                    "0. Exit!");
            choice=scanner.nextInt();
            if(choice==1){
                boolean check= bookArrayList.add(inputBook());
                if(check) System.out.println("Add new book successfully...!");

            }
            if(choice==2){
                System.out.println("Input ISBN of the book you want to find:");
                String key=new Scanner(System.in).nextLine();
                if(!findBook(key,bookArrayList))
                    System.out.println("Book not found...!");

               }
            }
        System.out.println("exiting program......!");

    }
}
