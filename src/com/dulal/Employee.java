package com.dulal;

public class Employee {

  protected int id;
  protected String name;
  static int idCount = 100;


  public Employee() {
    super();
  }

  public Employee(String name) {
    super();
    this.id = idCount++;
    this.name = name;
  }

  public void showEmpDetails() {
    System.out.println("ID: " + id + "\nName: " + name);
  }

  public void sendMessage() {
    System.out.println("Salary Added To account...");
  }
}
