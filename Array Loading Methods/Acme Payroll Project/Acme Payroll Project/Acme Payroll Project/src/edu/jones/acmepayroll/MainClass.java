//FILE : MainClass.java
//PROG : Dave Jones
//PURP : Demo loading an array of employee numbers
//     : Uses class Payroll.java and file employees.dat
package edu.jones.acmepayroll;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Payroll acmePay = new Payroll();
		Scanner myScanner = new Scanner(System.in);
		String fileName = "employees.dat";
		int index;
		
		acmePay.loadEmpNums(fileName);
		
		System.out.println("Which employee number do you want to see -->");
		
		index = myScanner.nextInt();
		
		if (acmePay.getOneEmpNum(index) >= 0)
			System.out.printf("Employee #%d's number is %d.\n", index, acmePay.getOneEmpNum(index));
		else
			System.out.println("Invalid employee number!");
		
		myScanner.close();

	}//END main
}//END class MainClass
