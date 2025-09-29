package week5;

// Claire Francis, Week5Program2, September 28, 2025

//  Write a program that allows a user to roll two dice. 
// The program displays the two numbers and their sum.  
// The program will use a "while" loop to keep rolling the two dice until the user is done.

import java.util.Scanner;

public class Week5Program2 {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		int die1;
		int die2;
		boolean roll = true;
		String answer;
		int sum;
		
		

		
		while(roll == true) {
			die1 = ((int) (Math.random()*6 +1)); //this illustrates random input
			System.out.println("The first random die number is: " + die1);
	
			die2 = ((int) (Math.random()*6 +1)); //this illustrates random input
			System.out.println("The second random die number is: " + die2);
			
			sum = die1 + die2;
		
			System.out.format("The sum of your two die numbers is: " + sum);
			
			System.out.print("Do you want to roll the dice?(yes, no): ");
			answer = userinput.nextLine();
			
			roll = (answer.equals("yes"));
		
		}
	}

}
