package org.example;

import java.util.Arrays;

public class Employee {

    private int id;
    private String email;
    private String fullName;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String email, String fullName, String password, String[] healthPlans) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name){
        if(index < 0 || index >= healthPlans.length){
            System.out.println("Invalid index");
        } else if(healthPlans[index] != null){
            System.out.println("Health plan is already done");
        } else {
            healthPlans[index] = name;
        }
    }


    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
