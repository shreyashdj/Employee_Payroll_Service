package com.bridgelabz.employeePayrollService;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author - Shreyash Jadhav
 */
public class EmployeePayrollService {
    ArrayList<Employee> employeeList = new ArrayList<>();   //  created employeeList object of class ArrayList
    Scanner scan = new Scanner(System.in);      //  created scan object of class Scanner
    /**
     *  created readEmployeeData method to store employee data
     */
    public void readEmployeeData(){
        /*
         *  created object of class Employee
         *  taking user input for employee data
         *  adding data (object) to ArrayList (employeeList)
         */
        Employee employee = new Employee();
        System.out.print("\n Enter Employee Id : ");
        employee.setEmployeeId(scan.next());
        System.out.print(" Enter Employee Name : ");
        employee.setEmployeeName(scan.next());
        System.out.print(" Enter Employee Salary : ");
        employee.setEmployeeSalary(scan.next());
        employeeList.add(employee);
        System.out.println("\n Employee Details Added");
    }
    /**
     *  created writeEmployeeData method to print employee data
     */
    public void writeEmployeeData() {
        /*
         *  using forEach loop iterating ArrayList (employeeList)
         *  and printing all employee data
         */
        System.out.println("\n ***** Employee Details *****");
        System.out.println("\n ****************************");
        for(Employee employee : employeeList) {
            System.out.println("\n Employee Id : " + employee.getEmployeeId());
            System.out.println(" Employee Name : " + employee.getEmployeeName());
            System.out.println(" Employee Salary : " + employee.getEmployeeSalary());
            System.out.println("\n ****************************");
        }
    }
}