package Okul.company;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
       // Employee ali= new Employee("Ali Can", LocalDate.now());
        HourlyEmployee ali= new HourlyEmployee("Ali Can",LocalDate.now(),120.0,50.0);
        System.out.println(ali.toString());
    }
}
