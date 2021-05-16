package za.ac.cput.Assignment2;

import java.util.Objects;


/**
 * Employee.java
 * Assignment 2- – Software Development Infrastructure
 * @author Justin and Nkuna (219319820)
 * Date:  16 May 2021
 */

public class Employee {

    private int empId;
    private String name,surname;

    public Employee(int empId, String name, String surname ) {
        this.empId = empId;
        this.name = name;
        this.surname = surname;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee emp = (Employee) o;
        return empId == emp.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

}
