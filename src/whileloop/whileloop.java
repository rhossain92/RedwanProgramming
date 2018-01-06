package whileloop;
//author: Redwan
//Program: while loop

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number= (int)(Math.random()*101);
Scanner input = new Scanner (System.in);
System.out.println("guess a magic number between 0 and 100");
int guess =-1;
while(guess!= number) {
	System.out.println("/n Enter you guess");
	guess = input.nextInt();
	if (guess == number)
		System.out.println("yes the number is " + number);
	else if (guess > number)
		System.out.println("your guess is too high");
	else
		System.out.println("your guess is too low");
	
}

	}
}


