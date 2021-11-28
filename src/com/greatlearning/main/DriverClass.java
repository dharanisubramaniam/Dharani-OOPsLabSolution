package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.schema.Employee;
import com.greatlearning.service.Service;
import com.greatlearning.utils.Constants;

public class DriverClass{
	
	public static Employee employee = new Employee("dharani","subramaniam");
	public static Service service = new Service();
	public static void main(String[] args) {
		
		displayMenu();
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		String email="";
		char[] password= {};
		String department="";
		switch(input) {
		case 1:
		{
			System.out.println("chosen department is Techical");
			department = Constants.Tech_Department;
			
			
		}
			break;
		case 2:
		{
		    
			System.out.println("chosen department is Admin");
			department = Constants.Admin_Department;
			 }
		    break;
		case 3:
		{
		    
			System.out.println("chosen department is Hr");
			department = Constants.HR_Department;
		}
		    break;
		case 4:
		{
		    
			System.out.println("chosen department is Legal");
			department = Constants.Legal_Department;
		}
		    break;
		default:
			System.out.println("enter valid option");
		}
		if(!department.isEmpty()) {
			email = service.generateEmail(employee.getFirstName(),employee.getLastName(),department);
			password = service.generatePassword();
			service.showCredentials(email,password);
		}
		scanner.close();
		
		
	}
	
	private static void displayMenu() {
		System.out.println("Please enter the department from the following:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
	}
	
	

}
