package com.dulal;

public class EmployeeDemo {
  public static void main(String[] args) {
FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("Rabi", 50000);
fullTimeEmployee.showEmpDetails();
fullTimeEmployee.showSalary();
fullTimeEmployee.sendMessage();
System.out.println("-----------------------------------------------");
PartTimeEmployee partTimeEmployee= new PartTimeEmployee("patrik",30);
partTimeEmployee.showEmpDetails();
partTimeEmployee.showSalary();
partTimeEmployee.sendMessage();
System.out.println("-----------------------------------------------");

  }
}
