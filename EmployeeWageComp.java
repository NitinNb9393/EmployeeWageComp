package com.bridgelabz.employeewagecomp;

import java.util.Scanner;

public class EmployeeWageComp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome Employy Wage Computation problem");
		toEmployeeIsPresent();
		toCalculationDailyEmployeeWage();
		toPartTimeEmployeeAndWage();
		usingSwitchCaseStatement();
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

	public static void toPartTimeEmployeeAndWage() {
		int is_fulltime_present = 1;
		int is_parttime_present = 2;
		int daily_wage;
		int wage_per_hr = 20;
		int working_hr;
		int emp_check = (int) (Math.floor(Math.random() * 10)) % 3;
		if (emp_check == is_fulltime_present) {
			System.out.println("Employee is full time present");
			working_hr = 8;
		} else if (emp_check == is_parttime_present) {
			System.out.println("Employee is part time present");
			working_hr = 4;
		} else {
			System.out.println("Employee is absent");
			working_hr = 0;
		}

		daily_wage = working_hr * wage_per_hr;
		System.out.println("Employee daily wage is " + daily_wage);

	}

	public static void usingSwitchCaseStatement() {
		int is_fulltime_present = 1;
		int is_parttime_present = 2;
		int daily_wage;
		int wage_per_hr = 20;
		int working_hr = 0;
		int emp_check = (int) (Math.floor(Math.random() * 10)) % 3;
		switch (emp_check) {
		case 1:
			System.out.println("Employee is full time present");
			working_hr = 8;
			break;
		case 2:
			System.out.println("Employee is part time present");
			working_hr = 4;
			break;
		default:
			System.out.println("Employee is absent");
			working_hr = 0;
		}
		daily_wage = working_hr * wage_per_hr;
		System.out.println("Employee daily wage is " + daily_wage);

	}
}
