package lab.saturday;
import java.util.*;
/*
Calculates the area of a circle given its radius 
SaturdayLab1: Data types. Variables. Constants. 
Problem 4 
Write an interactive java program that accepts the radius of a circle from
the user as input. The program computes and displays the area of the circle.
Use a constant in the program. Save the program as CircleArea.java.
Hint: the formula to compute the area of a circle is:
area = PI * radius * radius */

public class CircleArea {

	public static void main(String[] args) {
		
		//declare double radius
		double radius;
		
		//declare double PI
		final double PI = 3.14;
		
		//area double
		double area;
		
		//declare String - Text
		String aRes="The area of";
		String bRes = "a circle with radius is: ";
		String cRes= "is";
		
		//declare scanner
		Scanner sc;
		//create an object if type Scanner to take input vie keyboard
	    sc = new Scanner(System.in);
	    //input
		System.out.println("Please enter radius are: ");
		radius=sc.nextDouble();
		//processing
		area = PI * radius * radius;
		//output
		System.out.println(aRes + bRes + radius + cRes + area);
	

	}

}
