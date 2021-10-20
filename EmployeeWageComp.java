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
		toCalculationOfWagesForMonth();
		toCalculateWagesTill();
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

	public static void toCalculationOfWagesForMonth() {
		int is_fulltime_present = 1;
		int is_parttime_present = 2;
		int wage_per_hr = 20;
		int working_hr = 0;
		int days_in_month = 20;
		int monthly_total_wage = 0;
		int daily_wage_array[] = new int[20];
		for (int i = 0; i < days_in_month; i++) {
			int emp_check = (int) (Math.floor(Math.random() * 10)) % 3;
			switch (emp_check) {
			case 1:
				working_hr = 8;
				break;
			case 2:
				working_hr = 4;
				break;
			default:
				working_hr = 0;
			}
			daily_wage_array[i] = working_hr * wage_per_hr;
		}

		for (int j = 0; j < days_in_month; j++) {
			int day = j + 1;
			System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
			monthly_total_wage = monthly_total_wage + daily_wage_array[j];
		}
		System.out.println("\nMonthly wage is " + monthly_total_wage);
	}

	public static void toCalculateWagesTill() {
		int is_fulltime_present = 1;
		int is_parttime_present = 2;
		int wage_per_hr = 20;
		int working_hr = 0;
		int total_working_hr = 0;
		int days_in_month = 20;
		int max_working_hrs = 100;
		int monthly_total_wage = 0;
		int daily_wage_array[] = new int[20];
		for (int i = 0; i < days_in_month && total_working_hr < max_working_hrs; i++) {
			int emp_check = (int) (Math.floor(Math.random() * 10)) % 3;
			switch (emp_check) {
			case 1:
				working_hr = 8;
				break;
			case 2:
				working_hr = 4;
				break;
			default:
				working_hr = 0;
			}
			total_working_hr += working_hr;
			daily_wage_array[i] = working_hr * wage_per_hr;
		}
		for (int j = 0; j < days_in_month; j++) {
			int day = j + 1;
			System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
			monthly_total_wage = monthly_total_wage + daily_wage_array[j];
		}
		System.out.println("\nMonthly wage is " + monthly_total_wage);

	}
}
