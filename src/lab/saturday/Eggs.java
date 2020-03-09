package lab.saturday;

import java.util.Scanner;

/**
SaturdayLab1: Data types. Variables. Constants.
 calculates:
 -- the number of boxes required to pack eggs
 -- the number of leftover eggs 
 Problem 5
 Read the next problem, and then identify the input, the processing and the output. John the farmer has asked his son with collecting the eggs from the
 chicken cage each morning and putting them in boxes of 1 dozen eggs each.
 Unfortunately, John's son Joe is having trouble working out how many boxes
 he will need each morning. You have been asked to develop a java application
 to allow Joe to enter the number of eggs he has collected. The application
 should then calculate and display how many boxes can be filled and how
 many eggs Joe will have leftover. Hint: there are 12 eggs in 1 dozen.
*/
public class Eggs {
	public static void main(String[] args) {
		//constant named DOZEN
		final int DOZEN = 12;
		
		//declare a variables of types int
		int boxesCount, eggsCount, eggsLeftover;
		
		//declare a variable of type Scanner and create an object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of eggs: ");
		eggsCount = sc.nextInt();
		//calculate the number of box required to store the eggs
		boxesCount = eggsCount/DOZEN;
		System.out.println("==== ==== ==== ====");
		System.out.println("number of boxes required: " +boxesCount);
		
		//calculate the bumber of remaining eggs
		eggsLeftover = eggsCount%DOZEN;
		System.out.println("number of remaining eggs: " +eggsLeftover);
		System.out.println("==== ==== ==== ====");
		

	}

}
