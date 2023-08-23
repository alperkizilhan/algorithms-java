package Okul.company;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private double monthlyHours;        //aylık calışma saati
    private double hourlyWage;          // saatlik ücret
    public HourlyEmployee(String name, LocalDate hireDate){
        //super ve this aynı anda bir const içinde olamaz. ikisinden biri olacak ve en ustte olacak
        this(name,hireDate,120.0,40.0);
        /*
        super(name,hireDate);
        monthlyHours=120.0;
        hourlyWage=50.0;
         */
    }

    public HourlyEmployee(String name, LocalDate hireDate, double monthlyHours,double hourlyWage){
        super(name,hireDate);
        this.monthlyHours= monthlyHours;
        this.hourlyWage= hourlyWage;
    }

    public double getMonthlyHours(){
        return monthlyHours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double monthlyPay(){
        return hourlyWage*monthlyHours;
    }

    @Override
    public String toString(){
        //return "Hourly Employee: " +toString(); // boyle yaparcak metot sonsuz kere kendini cagırır.
        return "Hourly Employee: " +super.toString();
        // return "Hourly Employee: " +getName() + " " + getHireDate();
    }
}
//once super ın contcrustorını cağırır

//super kullandığımızda super in const cağırıyoruz.

