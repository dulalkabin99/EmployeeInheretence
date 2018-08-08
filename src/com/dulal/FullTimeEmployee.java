package com.dulal;

public class FullTimeEmployee extends Employee {
  private double salary;

  public FullTimeEmployee() {
    super();
  }

  public FullTimeEmployee(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double salaryCalculation() {
    return salary + 2000;
  }

  public void showSalary(){
    System.out.println("Salary=" + salaryCalculation()+"\nEmployee Type: FullTime");

  }
}
