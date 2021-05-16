package za.ac.cput.Assignment2;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * EmployeeTest.java
 * Assignment 2- – Software Development Infrastructure
 * @author Justin and Nkuna (219319820)
 * Date:  16 May 2021
 */



class EmployeeTest {


    @Test
    void addCollection(){
        //creating collection
        Set<Integer> collectionSet = new HashSet<>();
        //adding  Employee ID's  to  collection
        collectionSet.add(111);
        collectionSet.add(222);
        collectionSet.add(333);

        System.out.println(collectionSet);
    }
    @Test
    void removeCollection(){
        //creating collection
        Set<Integer> collectionSet = new HashSet<>();
        //add Employees in this collection
        collectionSet.add(111);
        collectionSet.add(222);
        collectionSet.add(333);
        //remove one
        collectionSet.remove(333);
        //Print added
        System.out.println(collectionSet);
    }
    @Test
    void findCollection(){
        //creating collection
        Set<Integer> collectionSet = new HashSet<>();
        //add employees in this collection
        collectionSet.add(111);
        collectionSet.add(222);
        collectionSet.add(333);
        //Find Employee with id number 111 in the set
        System.out.println(collectionSet.contains(222));

    }



    @Test
    void addMap(){
        //creating Employee map
        Map<Integer, String> empMap=new HashMap<>();
        //adding the  map
        empMap.put(1,"Justin");
        System.out.println(empMap);

    }

    @Test
    void removeMap(){
        //creating employee map
        Map<Integer, String> empMap=new HashMap<>();
        empMap.put(1,"Justin");
        empMap.put(2,"Jade");
        empMap.put(3,"Jetro");
        // Removing the existing employee key on the mapping
        empMap.remove(1);


        System.out.println(empMap);

    }
    @Test
    void findMap(){
        //creating map
        Map<Integer, String> empMap=new HashMap<>();
        //add map
        empMap.put(1,"Justin");
        empMap.put(2,"Jade");
        empMap.put(3,"Jetro");
        // find Employee with key 2
        String key = (String)empMap.get(2);
        //displaying the employee at key 2
        System.out.println("key 2 is " + key);

    }

    @Test
    void addSet(){
        //Creating HashSet a
        HashSet<String> empSet=new HashSet();
        //adding elements
        empSet.add("Employee 1");
        empSet.add("Employee 2");
        empSet.add("Employee 3");
        empSet.add("Employee 4");
        //printing set of employees
        System.out.println(empSet);

    }
    @Test
    void removeSet() {
        //Creating HashSet a
        HashSet<String> empSet= new HashSet();
        //adding elements
        empSet.add("Employee 1");
        empSet.add("Employee 2");
        empSet.add("Employee 3");
        empSet.add("Employee 4");
        //removing set using remove() method
        empSet.remove("employee 2");
        //printing set of employees
        System.out.println(empSet);
    }
    @Test
    void findSet(){

        //Creating HashSet

        HashSet<String> empSet = new HashSet();
        //adding elements
        empSet.add("Employee 1");
        empSet.add("Employee 2");
        empSet.add("Employee 3");
        empSet.add("Employee 4");
        // Find Employee  from  the set
        System.out.println(empSet.contains("Employee 1"));

    }





    @Test

    void addList() {
        List<Employee> empList = new ArrayList<Employee>();
        //Creating Employee list
        Employee e1 = new Employee(111, "Justin", "Nkuna");
        Employee e2 = new Employee(222, "Jade", "Mathebula");
        Employee e3 = new Employee(333, "Jetro", "Khosa");

        //Adding employees  to list

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        //printing all employees
        System.out.println(empList);

    }
    @Test
    void removeList () {
        List<Employee> empList = new ArrayList<Employee>();
        //Creating Employee list
        Employee e1 = new Employee(111, "Justin", "Nkuna");
        Employee e2 = new Employee(222, "Jade", "Mathebula");
        Employee e3 = new Employee(333, "Jetro", "Khosa");

        //Adding employees  to list

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        //Removing employee  from list
        empList.remove(e1);
        //Printing out
        System.out.println(empList);
    }
    @Test
    void findList(){
        List<Employee> empList = new ArrayList<Employee>();
        //Creating Employee list
        Employee e1 = new Employee(111, "Justin", "Nkuna");
        Employee e2 = new Employee(222, "Jade", "Mathebula");
        Employee e3 = new Employee(333, "Jetro", "Khosa");

        //Adding employees  to list

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);


        //find employee from the list

        System.out.println(empList.contains(e2));

    }





}