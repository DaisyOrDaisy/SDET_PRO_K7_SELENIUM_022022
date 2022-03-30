package lab08.bai1;

import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        Employees fullTimeEmployees1=new FullTimeEmployees();
        Employees fullTimeEmployees2=new FullTimeEmployees();
        Employees fullTimeEmployees3=new FullTimeEmployees();


        Employees contractor1=new Contractor();
        Employees contractor2=new Contractor();

        ArrayList<Employees> employeesArrayList=new ArrayList<>();
        employeesArrayList.add(fullTimeEmployees1);
        employeesArrayList.add(fullTimeEmployees2);
        employeesArrayList.add(fullTimeEmployees3);
        employeesArrayList.add(contractor1);
        employeesArrayList.add(contractor2);

        System.out.println("total salary is: "+sumSalary(employeesArrayList).toString());


    }
    public static Integer sumSalary(ArrayList<Employees> arrayList){
        Integer sumSalary=0;
        for(Employees i: arrayList){
            if(i instanceof FullTimeEmployees)
                sumSalary+=50000;
            else if(i instanceof Contractor)
                sumSalary+=40000;
            else
                sumSalary+=i.getSalary();
        }
        return sumSalary;
    }
}
