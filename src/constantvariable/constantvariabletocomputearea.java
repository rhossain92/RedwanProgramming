//author: Redwan Faisal
//program: creating constant variable
package constantvariable;

import java.util.Scanner;

public class constantvariabletocomputearea {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi= 3.1416;//declare a constant
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number for radius");
		double radius= input.nextDouble();
		double area= radius*radius*pi;
		System.out.println("the area of the circle is" + area);
		
		
		

	}

}
