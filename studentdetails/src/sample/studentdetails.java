package sample;
import java.util.Scanner;
class Student
{
	String USN, Name, Branch, Phone;
	Scanner input = new Scanner(System.in);
	void read( )
	{
		System.out.println("\nEnter Student Details");
		System.out.println("\nEnter USN");
		USN = input.nextLine();
		System.out.println("\nEnter Name");
		Name = input.nextLine();
		System.out.println("\nEnter Branch");
		Branch = input.nextLine();
		System.out.println("\nEnter Phone Number");
		Phone = input.nextLine();
	}
	
	void display( )
	{
		System.out.printf("%-20s %-20s %-20s %-20s", USN, Name, Branch, Phone);
	}
}

class studentdetails
{
	public static void main(String[ ] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter number of student details to be created");
		int number = input.nextInt( );
		Student s[ ] = new Student[number];
		// Read student details into array of student objects
		for (int i = 0; i < number; i++)
		{
			s[i] = new Student( );
			s[i].read( );
		}

		// Display student information
		System.out.printf("%-20s %-20s %-20s %-20s", "USN", "NAME", "BRANCH","PHONE");
		for (int i = 0; i < number; i++)
		{
			System.out.println( );
			s[i].display( );
		}
		input.close( );
	}
}
