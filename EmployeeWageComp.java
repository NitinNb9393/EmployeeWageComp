package com.bridgelabz.employeewagecomp;

import java.util.Scanner;

public class EmployeeWageComp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome Employy Wage Computation problem");
		toEmployeeIsPresent();
		toCalculationDailyEmployeeWage();
	}

	public static void toEmployeeIsPresent() {
		int is_present = 1;
		int emp_check = (int) (Math.floor(Math.random() * 10)) % 2;
		if (emp_check == is_present) {
			System.out.println("Employee is present");
		} else
			System.out.println("Employee is absent");
	}

	public static void toCalculationDailyEmployeeWage() {
		int is_fulltime_present = 1;
		int daily_wage;
		int wage_per_hr = 20;
		int working_hr;
		int emp_check = (int) (Math.floor(Math.random() * 10)) % 2;
		if (emp_check == is_fulltime_present) {
			System.out.println("Employee is present");
			working_hr = 8;
		} else {
			System.out.println("Employee is absent");
			working_hr = 0;
		}

		daily_wage = working_hr * wage_per_hr;
		System.out.println("Employee daily wage is " + daily_wage);
	}
}
