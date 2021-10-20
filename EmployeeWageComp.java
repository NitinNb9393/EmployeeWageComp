package com.bridgelabz.employeewagecomp;

public class EmployeeWageComp {
	public static void main(String[] args) {
		System.out.println("Welcome Employy Wage Computation problem");
		toEmployeeIsPresent();
	}

	public static void toEmployeeIsPresent() {
		int is_present = 1;
		int emp_check = (int) (Math.floor(Math.random() * 10)) % 2;
		if (emp_check == is_present) {
			System.out.println("Employee is present");
		} else
			System.out.println("Employee is absent");
	}

}
