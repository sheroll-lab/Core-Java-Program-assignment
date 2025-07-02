package com.sherollfaith.assignment;

import com.sherollfaith.assignment.employees.Developer;
import com.sherollfaith.assignment.employees.Manager;
import com.sherollfaith.assignment.utilitiess.EmployeeUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Manager> managers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        EmployeeUtilities utilities = new EmployeeUtilities();

        managers.add(new Manager("Sheroll", 101, 1000000, "Web Development", 10));
        managers.add(new Manager("Ravi", 102, 900000, "AI", 8));
        developers.add(new Developer("Nisha", 1002, 10000, "Web Development", "Java", "Ambulance Detection"));
        developers.add(new Developer("Ankit", 1003, 12000, "AI", "Python", "Chatbot"));

        int choice;

        while (true) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Show Managers");
            System.out.println("2. Show Developers");
            System.out.println("3. Add Manager");
            System.out.println("4. Add Developer");
            System.out.println("5. Delete Manager");
            System.out.println("6. Delete Developer");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    utilities.showAllManagers(managers);
                    break;
                case 2:
                    utilities.showAllDevelopers(developers);
                    break;
                case 3:
                    utilities.addManager(managers, input);
                    break;
                case 4:
                    utilities.addDeveloper(developers, input);
                    break;
                case 5:
                    utilities.deleteManager(managers, input);
                    break;
                case 6:
                    utilities.deleteDeveloper(developers, input);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
