package com.dulal;

public class PartTimeEmployee extends Employee {

  private  int hours;

  public PartTimeEmployee() {
    super();
  }

  public PartTimeEmployee(String name, int hours) {
    super(name);
    this.hours = hours;
  }

  public double salaryCalculation() {
    return hours * 150;
  }

    public void showSalary(){
      System.out.println("Salary=" + salaryCalculation()+"\nEmployee Type: PartTime");
    }

  }
