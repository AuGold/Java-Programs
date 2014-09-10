/* Author: Jordan Rodriguez
   File Name: Lab2.java
   Specification: This program is for practicing the use of primitive data types, experssions
   For: CSE 110 - LAB #2
   Time Spent: ~5 - 10 minutes
*/

public class Lab2
{
	public static void main(String[] args)
	{
		//variable declaration
		int age;
		double num;
		String firstName, lastName;
		
		age = 18;
		firstName = "Jordan";
		lastName = "Rodriguez";
		num = 18.457;
		
		//print out "[firstName] is [age] years old"
		System.out.println(firstName + " is " + age + " years old");
		
		//print out the name is "last, first" format
		System.out.println(lastName + ", " + firstName);
		
		//print out "arbitrary number [num]"
		System.out.println("Arbitrary number " + num);
		
		int x1 = 3, x2 = 4;
		int y1 = 5, y2 = 6;
		
		//calculate the sum of products and assign value to integer variable sop
		int sop = (x1 * x2) + (y1 * y2);
		
		//calculate the product of sums and assign value to integer variable pos 
		int pos = (x1 + x2) * (y1 + y2);
		
		
		//print out sum of product
		System.out.println("Sum of Product: " + sop);
		
		//print out product of sum
		System.out.println("Product of Sum: " + pos);
	}
}