package com.sherollfaith.assignment.utilitiess;

import com.sherollfaith.assignment.employees.Developer;
import com.sherollfaith.assignment.employees.Manager;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeUtilities {

    public void showDeveloper(Developer developer){
        System.out.println(developer);
    }

    public void showManager(Manager manager){
        System.out.println(manager);
    }

    public void showAllManagers(List<Manager> managers) {
        int count=1;
        if (managers.isEmpty()) {
            System.out.println("No managers found.");
            return;
        }
        for (Manager manager : managers) {
            System.out.println("\n***"+count++ +"***");
            System.out.println(manager);
        }
    }

    public void showAllDevelopers(List<Developer> developers) {
        int count=1;
        if (developers.isEmpty()) {
            System.out.println("No managers found.");
            return;
        }
        for (Developer developer : developers) {
            System.out.println("\n***"+count++ +"***");
            System.out.println(developer);
        }
    }

    public void addManager(List<Manager> managers, Scanner input) {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        System.out.print("Enter salary: ");
        int salary = input.nextInt();
        input.nextLine();
        System.out.print("Enter department: ");
        String dept = input.nextLine();
        System.out.print("Enter team size: ");
        int teamSize = input.nextInt();

        Manager m = new Manager(name, id, salary, dept, teamSize);
        managers.add(m);

        System.out.println("Manager added successfully.");
    }

    public void addDeveloper(List<Developer> developers, Scanner input) {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        System.out.print("Enter salary: ");
        int salary = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter programming language: ");
        String lang = input.nextLine();
        System.out.print("Enter project: ");
        String proj = input.nextLine();

        Developer d = new Developer(name, id, salary, "", lang, proj); // department optional here
        developers.add(d);
        System.out.println("Developer added successfully.");
    }

    public void deleteManager(List<Manager> managers, Scanner input) {
        System.out.print("Enter Manager ID to delete: ");
        int id = input.nextInt();
        boolean found = false;

        Iterator<Manager> iterator = managers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                found = true;
                System.out.println("Manager deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Manager with ID " + id + " not found.");
        }
    }

    public void deleteDeveloper(List<Developer> developers, Scanner input) {
        System.out.print("Enter Developer ID to delete: ");
        int id = input.nextInt();
        boolean found = false;

        Iterator<Developer> iterator = developers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                found = true;
                System.out.println("Developer deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Developer with ID " + id + " not found.");
        }
    }
}
