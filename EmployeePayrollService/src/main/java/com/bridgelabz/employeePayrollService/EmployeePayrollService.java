package com.bridgelabz.employeePayrollService;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author - Shreyash Jadhav
 */
public class EmployeePayrollService {
    ArrayList<Employee> employeeList = new ArrayList<>();   //  created employeeList object of class ArrayList
    Scanner scan = new Scanner(System.in);      //  created scan object of class Scanner

    /**
     * created readEmployeeData method to store employee data
     */
    public void readEmployeeData() {
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
     * created writeEmployeeData method to print employee data
     */
    public void writeEmployeeData() {
        /*
         *  using forEach loop iterating ArrayList (employeeList)
         *  and printing all employee data
         */
        System.out.println("\n ***** Employee Details *****");
        System.out.println("\n ****************************");
        for (Employee employee : employeeList) {
            System.out.println("\n Employee Id : " + employee.getEmployeeId());
            System.out.println(" Employee Name : " + employee.getEmployeeName());
            System.out.println(" Employee Salary : " + employee.getEmployeeSalary());
            System.out.println("\n ****************************");
        }
    }

    public void checkFileOrDirExists() {
        System.out.print("\n Enter Name of Directory or File: ");
        scan.nextLine();
        String name = scan.nextLine();
        Path filePath = Paths.get("C:\\Users\\Shreyash Jadhav\\Desktop\\bridgelabz\\RFP 175 Intellij\\Employee_Payroll_Service\\Test Files\\" + name);
        if (Files.exists(filePath)) {
            System.out.println("\n File Exist");
        } else {
            System.out.println("\n File Not Exist");
        }
    }

    public void createDirectory() {
        System.out.print("\n Enter Name of Directory : ");
        scan.nextLine();
        String dirName = scan.nextLine();
        Path filePath = Paths.get("C:\\Users\\Shreyash Jadhav\\Desktop\\bridgelabz\\RFP 175 Intellij\\Employee_Payroll_Service\\Test Files\\" + dirName);
        try {
            Files.createDirectories(filePath);
        } catch (IOException e) {
            System.out.println("\n Enter Valid Path");
        }
    }

    public void createFile() {
        System.out.print("\n Enter Name of File : ");
        scan.nextLine();
        String fileName = scan.nextLine();
        Path filePath = Paths.get("C:\\Users\\Shreyash Jadhav\\Desktop\\bridgelabz\\RFP 175 Intellij\\Employee_Payroll_Service\\Test Files\\" + fileName);
        try {
            Files.createFile(filePath);
        } catch (IOException e) {
            System.out.println("\n Enter Valid Path");
        }
    }

    public void deleteFileOrDir() {
        System.out.print("\n Enter Name of Directory : ");
        scan.nextLine();
        String dirName = scan.nextLine();
        Path filePath = Paths.get("C:\\Users\\Shreyash Jadhav\\Desktop\\bridgelabz\\RFP 175 Intellij\\Employee_Payroll_Service\\Test Files\\" + dirName);
        try {
            Files.delete(filePath);
        } catch (IOException e) {
            System.out.println("\n Enter Valid Path");
        }
        if (!Files.exists(filePath)) {
            System.out.println("\n Deleted Successfully");
        }
    }

    public void listFilesAndDir() {
        System.out.print("\n Enter Name of Directory : ");
        scan.nextLine();
        String dirName = scan.nextLine();
        Path filePath = Paths.get("C:\\Users\\Shreyash Jadhav\\Desktop\\bridgelabz\\RFP 175 Intellij\\Employee_Payroll_Service\\" + dirName);
        String[] contents = filePath.toFile().list();
        if (contents != null) {
            for (String file : contents) {
                System.out.println(" " + file);
            }
        } else {
            System.out.println("\n Enter Valid Path");
        }
    }
}