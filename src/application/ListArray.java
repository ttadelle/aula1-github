package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;



public class ListArray {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		List <Employees> list = new ArrayList<>();
		
		System.out.print("How many empolyees wull be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		for(int i =0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" +(i+1)+":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
		    
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Entre the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("Lis of Employees: ");
		for (Employees emp: list) {
			System.out.println(emp);
		};
		
		
		
		sc.close();
	}	

		public static Integer position(List<Employees> list, int id) {
			for (int i = 0; i < list.size(); i++)
				if(list.get(i).getId() == id) {
					return i;
				}
				return null;
		}
        
	
}