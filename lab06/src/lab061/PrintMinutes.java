package lab061;


import java.util.ArrayList;

public class PrintMinutes {
    public static void main(String[] args) {
        String str="2hrs and 5 minutes";
        calculateMinutes(str);

    }
    public static void calculateMinutes(String str){
        Integer numberOfMinutes=0;
        ArrayList<String> arrayList=new ArrayList<String>();
        String[] arr=str.split("[^0-9]");

       for(String i:arr){
           if(!i.isEmpty())
               arrayList.add(i);
       }
       if(arrayList.size()==2){
           numberOfMinutes=Integer.parseInt(arrayList.get(0))*60+Integer.parseInt(arrayList.get(1));
       }
        System.out.printf("the number of minutes in total : %d\n",numberOfMinutes);

    }
}
