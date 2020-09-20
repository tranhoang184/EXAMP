package com.vn.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.vn.entities.Employee;
import com.vn.controller.Controller;

public class Main {
	public static void main(String[] args) {

		Controller controller = new Controller();
		List<Employee> listEmployee = new ArrayList<Employee>();
		listEmployee.add(new Employee(1, "Hoang", 17, 20));
		listEmployee.add(new Employee(2, "Huy", 26, 60));
		listEmployee.add(new Employee(3, "Thuy", 18, 30));
		listEmployee.add(new Employee(4, "Hung", 26, 50));
		listEmployee.add(new Employee(5, "Long", 30, 40));
		listEmployee.add(new Employee(6, "Yen", 18, 30));
		listEmployee.add(new Employee(7, "Dat", 19, 19));
		listEmployee.add(new Employee(7, "Dat", 19, 19));
		listEmployee.add(new Employee(9, "Nam", 20, 30));

		System.out.println("Count listEmployee: " + listEmployee.size());

		Set<Employee> set = new HashSet<Employee>(listEmployee);
		System.out.println("Count after HashSet: " + set.size());
		for (Employee employee : set) {
			System.out.println(employee);
		}

		System.out.println("------------------------------------------------");
		System.out.println("Sorting by Name: ");
		List<Employee> listSortName = controller.sortByName(listEmployee);
		controller.showEmployees(listSortName);

		System.out.println("------------------------------------------------");
		System.out.println("Sorting by Salary DESC: ");
		List<Employee> listSortSalary = controller.sortBySalaryDESC(listEmployee);
		controller.showEmployees(listSortSalary);

		System.out.println("------------------------------------------------");
		System.out.println("List of 3 youngest employees and highest salary: ");
		List<Employee> listsortSalaryAge = controller.sortBySalaryAge(listEmployee);
		controller.showEmployees(listsortSalaryAge);

		System.out.println("------------------------------------------------");
		System.out.println("List of employee contain character N: ");
		List<Employee> listcontainName = controller.containNameChar(listEmployee);
		controller.showEmployees(listcontainName);
	}
}
