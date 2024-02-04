/**
 * Class: CMSC203
 * instructor: Professor Khandan Monshi
 * Description: 
 * An introduction to Object Oriented Design (OOP) using Java. 
 * This assignment covers Java fundamentals, using the Scanner class for user input, 
 * decision structures, loops, cmd line processing and input validation.   
 * Due Date: February 6th, 2024
 * Platform / Compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Student: Donald Le
 */

import java.util.Scanner; //imports Scanner class to read input from user
import java.util.Random; //imports Random class to create a random number

public class ESPGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //allows user input from keyboard
		
		//gets user information
		
		//Declares variables and ask user for name, description, and due date		
		System.out.print("Enter your name: "); //prompts user for name
		String name = input.nextLine(); //allows user to input name
		System.out.print("Describe yourself: "); //prompts user for description of themselves
		String desc = input.nextLine(); //allows user to input description
		System.out.print("Due Date: "); //prompts user for due date
		String dueDate = input.nextLine(); //allows user to input due date
		System.out.println(); //adds line to separate text
		
		//start of color game
		
		//displays introduction to color game
		System.out.println("Test your ESP skills!");
		System.out.println(); //adds line to separate text

		//declaring variables and creating object for game
		int totalCorrect = 0; //sentinel to count total correct
		
		//start of loop
		for (int i = 1; i <= 11; i++) //creates for loop that executes loop 11 times
		{
			//Declaring constant variables of list of colors on the rainbow
			final String COLOR_RED = "Red"; //declares constant variable red to string "red"
			final String COLOR_ORANGE = "Orange"; //declares constant variable orange to string "orange"
			final String COLOR_YELLOW = "Yellow"; //declares constant variable yellow to string "red"
			final String COLOR_GREEN = "Green"; //declares constant variable green to string "green"
			final String COLOR_BLUE = "Blue"; //declares constant variable blue to string "blue"
			final String COLOR_INDIG0 = "Indigo"; //declares constant variable indigo to string "indigo"
			final String COLOR_VIOLET = "Violet"; //declares constant variable violet to string "violet"
			
			//declaring variables for computers color and user color
			String computerColor = ""; //holds value for computers color
			String userColor; //holds value for user input of color
			
			//displays start of round and asks user to guess
			System.out.println("Round " + i +"\n"); //states which round 
			System.out.println("I am thinking of a color."); 
			System.out.println("Is it Red, Orange, Yellow, Green, Blue, Indigo, or Violet?"); 
			System.out.print("Enter your guess:"); //displays prompt for user to enter input
			
			//allows user to input color
			userColor = input.nextLine(); //allows user to input color
			userColor = userColor.toUpperCase(); //converts input to uppercase 
			System.out.println(); //adds line to separate text
			
			//tests input for validity 
			//compares input to colors to see if they do not match one or another color
			while(!(userColor.equals("RED") || 
					userColor.equals("ORANGE") || 
					userColor.equals("YELLOW") || 
					userColor.equals("GREEN") ||
					userColor.equals("BLUE") ||
					userColor.equals("INDIGO") ||
					userColor.equals("VIOLET"))) 
				{
					System.out.println("Input is invalid.");  //displays that input is wrong
					System.out.println("Is it Red, Orange, Yellow, Green, Blue, Indigo, or Violet?"); //ask user for input
					System.out.print("Enter your guess again: ");
					userColor = input.nextLine(); //allows user to input color
					userColor = userColor.toUpperCase(); //converts input to uppercase to compare string
					System.out.println(); //adds line to separate text
				}
					
			//assigns string value of color to index of corresponding color
			switch (userColor) {
				case "RED":
					userColor = COLOR_RED; //assigns users color red to string literal "Red"
					break;
				case "ORANGE":
					userColor = COLOR_ORANGE; //assigns users color orange to string literal "Orange"
					break;
				case "YELLOW":
					userColor = COLOR_YELLOW; //assigns users color yellow to string literal "Yellow"
					break;
				case "GREEN":
					userColor = COLOR_GREEN; //assigns users color green to string literal "Green"
					break;
				case "BLUE":
					userColor = COLOR_BLUE; //assigns users color blue to string literal "Blue"
					break;
				case "INDIGO":
					userColor = COLOR_INDIG0; //assigns users color indigo to string literal "Indigo"
					break;
				case "VIOLET":
					userColor = COLOR_VIOLET; //assigns users color violet to string literal "Violet"
					break;
			}
			
			
			//assigns random index to color for computer
			Random r = new Random(); //creates a random number generator
			int randomColor = r.nextInt(7); //assigns a number to a color for computer
			
			//assigns index of random color to corresponding color 
			switch (randomColor) {
			case 0:
				computerColor = COLOR_RED; //assigns string variable to string literal "Red"
				break;
			case 1:
				computerColor = COLOR_ORANGE; //assigns string variable to string literal "Orange"
				break;
			case 2:
				computerColor = COLOR_YELLOW; //assigns string variable to string literal "Yellow"
				break;
			case 3:
				computerColor = COLOR_GREEN; //assigns string variable to string literal "Green"
				break;
			case 4:
				computerColor = COLOR_BLUE; //assigns string variable to string literal "Blue"
				break;
			case 5:
				computerColor = COLOR_INDIG0; //assigns string variable to string literal "Indigo"
				break;
			case 6:
				computerColor = COLOR_VIOLET; //assigns string variable to string literal "Violet"
				break;
			}
		
			//displays computers color choice
			System.out.println("I was thinking of " + computerColor);
			
			//compares computers color to users color and increments sentinel
			if (computerColor.equals(userColor))
				totalCorrect += 1;	
			
			System.out.println(); //adds line to separate text
			
		}
		
		//displays to user number of times user was correct 
		System.out.println("Game over \n");
		System.out.println("You guessed " + totalCorrect + " out of 11 correctly."); //displays correct guesses out of 11 
		System.out.println("Student name: " + name); //displays name
		System.out.println("User Description: " + desc); //displays description of user
		System.out.println("Due Date: " + dueDate); //displays due date
	}

}
