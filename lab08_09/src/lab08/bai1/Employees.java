package lab08.bai1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Employees {
    private String id;
    private String name;
    private Integer salary;

    public Employees() {
    }

    public Employees(String id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer salary(){
        return getSalary();

    }

}

