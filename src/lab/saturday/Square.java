package lab.saturday;
/**
Calculates the area of a square given a side SaturdayLab1: Data types. Variables. Constants. Problem 2
Write a java program that declares a variable to represent the side of a square.
The side of the square is 7 units. Compute and display the area of the square.
Save the program as Square.java */
public class Square {
	
	public static void main(String[] args) {
		
		//declare the variable to store the side
		int side;
		
		//input
		side = 7;
		//assign/store the value 7 to variable named side
		
		
		//processing
		//declare a variable named area to store
		int area;
		//the area of the square
		area=side*side;
		
		//output
		System.out.print("area is: " + area);

	}

}
