package com.bridgelabz.employeePayrollService;
/**
 * @author - Shreyash Jadhav
 */
public class Employee {
    /*
     *  private String variables to store data of employee
     */
    private String employeeName;
    private String employeeId;
    private String employeeSalary;
    /**
     *  Getters and Setters methods of each variable declared above
     *  to get and set data of employee
     */
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}