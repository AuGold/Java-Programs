// Jordan Rodriguez - Testing Calculator Program... Version ALPHA 0.1

import java.util.Scanner;
import static java.lang.Math.*;
public class Program_ALPHA{
	public static void main(String [] args){
		Scanner reader = new Scanner(System.in); //Allows for input from user
		
        for(;;){
		System.out.println("Choose a subject");
		System.out.print("Algebra1, Geometry, Algebra2, or Exit:  "); //Asking for the subject
		String subject = reader.nextLine();
		if (subject.equals("Algebra1")){ //Use this portion if input1 is Algebra1
			System.out.println("");
			System.out.println("");
			System.out.println("Welcome to Algebra1!");
			System.out.println("Choose an equation: ");
			System.out.print("QuadraticFormula, PythagoreanTheorem:  "); //asks for which formula
			String Alg1 = reader.nextLine();
				if (Alg1.equals("QuadraticFormula")){
					System.out.println("");
					System.out.println("");
					System.out.println("x=-b+/-sqrt(b^2-4ac)/(2a)");
					System.out.print("What does a equal?: "); //ask for the three variables in the equation
					double a = reader.nextDouble();
					System.out.print("What does b equal?: ");
					double b = reader.nextDouble();
					System.out.print("What does c equal?: ");
					double c = reader.nextDouble();
					double rt = sqrt((b * b) - (4.0 * a * c)); //calculate the values of the equation
					double x = (-b + rt) / (2.0 * a);
					double z = (b + rt) / (2.0 * a);
					System.out.print("Positive X: "); //output the answers of the equation
					System.out.println(x);
					System.out.print("Negative X: ");
					System.out.println(z);
					System.out.println("");
					System.out.println("");
					System.out.println("Thank you for using me!");
					System.exit(0);
				}
				
				else if (Alg1.equals("PythagoreanTheorem")){
					System.out.println("What variable would you like to solve for?");
					System.out.print("A, B, or C?: "); //asks for variable to solve for
					String Pythag = reader.nextLine();
						if (Pythag.equals("A")){
							System.out.println("");
							System.out.println("");
							System.out.println("A = sqrt(C^2 - B^2)");
							System.out.print("What does B equal?: "); //asks for variables known
							double B = reader.nextDouble();
							System.out.print("What does C equal?: ");
							double C = reader.nextDouble();
							double A = sqrt((C * C) - (B * B)); //calculates the answer
							System.out.print("A: ");
							System.out.println(A); //outputs the answer of the equation
							System.out.println("");
							System.out.println("");
							System.out.println("Thank you for using me!");
							System.exit(0);
						}	
						else if (Pythag.equals("B")){
							System.out.println("");
							System.out.println("");
							System.out.println("B = sqrt(C^2 - A^2)");
							System.out.print("What does A equal?: "); //asks for variables known
							double A = reader.nextDouble();
							System.out.print("What does C equal?: ");
							double C = reader.nextDouble();
							double B = sqrt((C * C) - (A * A)); //calculates the answer
							System.out.print("B: ");
							System.out.println(B); //outputs the answer of the equation
							System.out.println("");
							System.out.println("");
							System.out.println("Thank you for using me!");
							System.exit(0);
						}
						else if (Pythag.equals("C")){
							System.out.println("");
							System.out.println("");
							System.out.println("C = sqrt(A^2 + B^2)");
							System.out.print("What does A equal?: "); //asks for variables known
							double A = reader.nextDouble();
							System.out.print("What does B equal?: ");
							double B = reader.nextDouble();
							double C = sqrt((A * A) + (B * B)); //calculates the answer
							System.out.print("C: ");
							System.out.println(C); //outputs the answer of the equation
							System.out.println("");
							System.out.println("");
							System.out.println("Thank you for using me!");
							System.exit(0);
						}
						else{
							System.out.println("No thank you.");
							System.exit(0);
						}
					
				}else{
					System.out.println("");
					System.out.println("");
					System.out.println("Use a correct formula, idiot.");
				}
				
		}else if (subject.equals("Geometry")){ //Use this portion if input1 is Geometry
			System.out.println("");
			System.out.println("");
			System.out.println("Currently no output.");
		}
		
		else if (subject.equals("Algebra2")){ //Use this portion if input1 is Algebra2
			System.out.println("");
			System.out.println("");
			System.out.println("Currently no output.");
		}	
        
        else if (subject.equals("Exit")){ //Use this for exiting the program
            System.out.println("");
            System.out.println("");
            System.out.println("Thank you for using me!");
            System.out.println("Currently we are in version 0.0.1");
            System.out.println("Copyright Jordan '[Au]Gold' Rodriguez");
            System.out.println("Thanks to Mr. Luscher and Jonathan Roy for their big help!");
            System.out.println("Long live Lord Mazorith!");
            System.exit(0);
		}else{ //Use this if people can't spell
			System.out.println("");
			System.out.println("");
			System.out.println("Please input a correct subject! D:");
		}
        }
	}
}