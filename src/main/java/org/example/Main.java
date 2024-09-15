package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Healthplan healthplan1 = new Healthplan(1, "Health Plan A", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Health Plan B", Plan.PREMIUM);

        String[] healthplansArray = new String[3];
        healthplansArray[0] = healthplan1.getName();
        healthplansArray[1] = healthplan2.getName();

        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123", healthplansArray);

        employee.addHealthPlan(0, "BASIC");
        employee.addHealthPlan(1, "PREMIUM");
        employee.addHealthPlan(5, "Ultimate Health Plan"); // Geçersiz indeks
        employee.addHealthPlan(0, "Extra Health Plan"); // Zaten dolu

        System.out.println(employee);

        // Company objesi oluşturma ve işlemler
        String[] developers = new String[3];
        Company company = new Company(1, "Tech Solutions", 500000.0, developers);

        company.addEmployee(0, "John Doe");
        company.addEmployee(1, "Jane Smith");
        company.addEmployee(3, "Mark Johnson"); // Geçersiz indeks
        company.addEmployee(0, "Michael Brown"); // Zaten dolu

        System.out.println(company);
    }


}