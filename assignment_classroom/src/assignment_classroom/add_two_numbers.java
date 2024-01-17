package assignment_classroom;

import java.util.Scanner;
public class add_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Addition:");
		System.out.println("Enter number1:");
		num1=scan.nextInt();
		System.out.println("Enter number2:");
		num2=scan.nextInt();
		
		sum=num1+num2;
		System.out.println("Sum:"+sum);
		

	}

}
