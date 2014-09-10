/* Author: Jordan Rodriguez
   File Name: Assignment2.java
   Specification: Display questions and read user input
   For: CSE 110
   Time Spent: ~10 - 15 minutes
   
   Question 1-a) False
   Question 1-b) False
   Question 1-c) True
   Question 1-d) True
   
   Question 2:
		System.out.print("Please input your full name:  ");
		name = scan.nextLine();
	
   Question 3:
		Hy
*/

import java.util.Scanner;

public class Assignment2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number1, number2, number3;
		double average;
		String firstName, middleName, lastName;
		int seconds;
		
		//Task 1: Calculate the average of three inputs
		System.out.print("Please input integer 1:  ");
		number1 = scan.nextInt();
		System.out.print("Please input integer 2:  ");
		number2 = scan.nextInt();
		System.out.print("Please input integer 3:  ");
		number3 = scan.nextInt();
		
		average = (((double) number1) + number2 + number3) / 3;
		System.out.print("The average of the integers is: ");
		System.out.printf("%.2f\n", average);
		//end task 1
		
		System.out.println("");
		scan.nextLine();
		
		//Task 2: Calculate the # of characters
		System.out.print("What is your first name?  ");
		firstName = scan.nextLine();
		System.out.print("What is your middle name?(if none, hit enter)  ");
		middleName = scan.nextLine();
		System.out.print("What is your last name?  ");
		lastName = scan.nextLine();
		
		int n = firstName.length() + middleName.length() + lastName.length();
		System.out.println("The total number of characters is: " + n);
		//end task 2
		
		System.out.println("");
		
		//Task 3: Convert seconds to H:M:S
		System.out.print("Please input the total seconds: ");
		seconds = scan.nextInt();
		
		int hours = seconds/3600;
		seconds -= hours*3600;
		int minutes = seconds/60;
		seconds -= minutes*60;
		System.out.println("The total time (Hours:Minutes:Seconds) is: " + hours + ":" + minutes + ":" + seconds);
		//end task 3
		
		//end Assignment2
		
		
	}
}
			