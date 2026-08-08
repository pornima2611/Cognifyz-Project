package com.cognifyz;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3CRUD {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<String> tasks = new ArrayList<>();

	        while(true) {

	            System.out.println("\n===== TASK MANAGER =====");
	            System.out.println("1. Add Task");
	            System.out.println("2. View Tasks");
	            System.out.println("3. Update Task");
	            System.out.println("4. Delete Task");
	            System.out.println("5. Exit");

	            System.out.print("Enter Choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch(choice) {

	                case 1:
	                    System.out.print("Enter Task: ");
	                    tasks.add(sc.nextLine());
	                    System.out.println("Task Added Successfully");
	                    break;

	                case 2:
	                    System.out.println("\nTask List:");
	                    for(int i = 0; i < tasks.size(); i++) {
	                        System.out.println(i + " : " + tasks.get(i));
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Task Index: ");
	                    int updateIndex = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter New Task: ");
	                    tasks.set(updateIndex, sc.nextLine());

	                    System.out.println("Task Updated");
	                    break;

	                case 4:
	                    System.out.print("Enter Task Index: ");
	                    int deleteIndex = sc.nextInt();

	                    tasks.remove(deleteIndex);
	                    System.out.println("Task Deleted");
	                    break;

	                case 5:
	                    System.out.println("Thank You");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid Choice");
	            }
	        }

	}

}
