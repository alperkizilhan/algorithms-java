package Okul.company;

import java.time.LocalDate;

public class Employee extends Object{
    private String name;
    private LocalDate hireDate;

    public Employee(String name,LocalDate hireDate){
        super();
        this.name=name;
        this.hireDate=hireDate;

    }

    //Getter
    public String getName(){
        return name;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }

    @Override
    public String toString(){
        return name + " " + hireDate.toString();
    }

}
