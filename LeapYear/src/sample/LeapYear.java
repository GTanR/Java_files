package sample;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		
		int year;
		boolean isLeap;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any year:");
		year = scan.nextInt();
		
		scan.close();
		
		if(year % 4 == 0)
		{
			isLeap = true;
		}
		else
		{
			isLeap = false;
		}
		
		
		if(isLeap == true)
		{
			System.out.println(year+" is a Leap Year");
		}
		else
		{
			System.out.println(year+" is not a Leap Year");
		}
	
	}

}
