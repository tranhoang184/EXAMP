package com.vn.CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vn.entities.Employee;

public class PutCSV {
	public static void main(String[] args) {
		String filePath = "D:\\Eclipse-Workspace\\StudentManagement\\src\\com\\vn\\CSV\\employee.txt";
		System.out.println("read employee.csv: " + filePath);
		readCSV(filePath);
	}

	private static void readCSV(String filePath) {
		BufferedReader reader = null;

		try {
			List<Employee> listEmployee = new ArrayList<Employee>();

			String line = "";
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();

			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(",");
				if (fields.length > 0) {
					listEmployee.add(new Employee(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]),
							Float.parseFloat(fields[3]), convertStringToDate(fields[4])));
				}
			}
			for (Employee employee : listEmployee) {
				System.out.println("\n");
				System.out.println("Employee Id      : " + employee.getId());
				System.out.println("Employee Name    : " + employee.getName());
				System.out.println("Employee Age     : " + employee.getAge());
				System.out.println("Employee Salary  : " + employee.getSalary());
				System.out.println("Employee Birthday: " + convertDateToString(employee.getBirthday()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static Date convertStringToDate(String str) {
		try {
			return new SimpleDateFormat("yyyy/MM/dd").parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String convertDateToString(Date date) {
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-dd-MM");
		return formatDate.format(date);
	}
}