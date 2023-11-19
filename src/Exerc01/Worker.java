package Exerc01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;


public class Worker {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter department name: ");
        String departmentName = scan.nextLine();

        System.out.println("Enter worker data: ");

        System.out.println("Name: ");
        String workerName = scan.nextLine();

        System.out.println("Level: ");
        String workerLevel = scan.nextLine();

        System.out.println("Base Salary: ");
        double baseSalary = scan.nextDouble();

        WorkerData workerData = new WorkerData(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts? ");
        int n = scan.nextInt();
        scan.nextLine();


        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract " + "#" + i);
            System.out.println("Date: ");
            Date contractDate = sdf.parse(scan.next());
            System.out.println("Value of Hour: ");
            double valueHour = scan.nextDouble();
            System.out.println("Duration: ");
            int hours = scan.nextInt();
            HourContract contract = new HourContract(contractDate, valueHour, hours);
            workerData.addContract(contract);
        }
            scan.nextLine();
            System.out.println("Enter mounth and year: ");
            String monthYear = scan.next();
            int month = Integer.parseInt(monthYear.substring(0, 2));
            int year = Integer.parseInt(monthYear.substring(3));
            scan.nextLine();

            System.out.println("Name: " + workerData.getName());
            System.out.println("Department: " + workerData.getDepartment().getName());
            System.out.println("Income for " + monthYear + ": " + workerData.income(year, month));


        }
    }

