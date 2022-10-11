package com.bridgelabz.employeePayrollService;
/**
 * @author - Shreyash Jadhav
 */
public class Main {
    /**
     *  created main method to run project
     */
    public static void main(String[] args) {
        /*
         *  print welcome message and created object of class EmployeePayrollService
         *  using do-while loop created console to perform some function like
         *  Add Employee Details, Show Employee Details, Exit
         */
        System.out.println("\n ***** Welcome to Employee Payroll Service *****");
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        int option;		// variable to store value of console options
        do {
            System.out.println("\n *** Available Options *** ");
            System.out.println(" 1. Add Employee Details \n 2. Show Employee Details \n 3. Exit");
            System.out.print(" Enter option to perform activity : ");
            option = employeePayrollService.scan.nextInt();
            switch (option) {
                case 1 -> employeePayrollService.readEmployeeData();
                case 2 -> employeePayrollService.writeEmployeeData();
                case 3 -> System.out.println("\n Exited Successfully");
                default -> System.out.print("\n Option not Available \n");
            }
        } while(option != 3);
    }
}