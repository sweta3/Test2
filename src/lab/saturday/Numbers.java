package lab.saturday;
/*
Calculates the arithmetic operations
SaturdayLab1: Data types. Variables. Constants.Problem 3Save file as Numbers.java  -- arithmetic operations with int and double operands (i.e. variables)
 -- mixed addition
 -- integer division. double division. mixed division */

public class Numbers {

	public static void main(String[] args) {
		
		//declare variable of type int
		int iNumOne, iNumTwo, iResult;
		
		//declare variable of type double
		double dNumOne, dNumTwo, dResult;
		
		//assign/store
		iNumOne = 5;
		iNumTwo = 2;
		
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		String intRes = "int result: ";
		String dRes = "double result: ";
		
		//additional task
		iResult = iNumOne +(int) dNumOne; //casting to the same data type 
		dResult = dNumTwo+ iNumOne;
		System.out.println(intRes + iResult);
		System.out.println(dRes + dResult);
		
		//multiplication task
		iResult = (int) (dNumOne * dNumOne);  
		dResult = dNumTwo*iNumOne;
		
		System.out.println(intRes + iResult);
		System.out.println(dRes + dResult);
		
		
		//devision task
		iResult = iNumOne /(int) dNumOne;
		dResult = iNumTwo/iNumOne;
		
		System.out.println(intRes + iResult);
		System.out.println(dRes + dResult);
		
		//subtraction task
		iResult = iNumOne -(int) dNumOne;  
		dResult = (double) (iNumTwo-iNumOne);
		
		System.out.println(intRes + iResult);
		System.out.println(dRes + dResult);
	}

}
