package sample;
import java.util.Scanner;
public class SimpleInterest 
{
	public static void main(String args[])
	{
		float p,t,r,simpleinterest;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principle:");
		p = scan.nextFloat();
		
		System.out.println("Enter the Rate of Interest:");
		r = scan.nextFloat();
		
		System.out.println("Enter the time period:");
		t = scan.nextFloat();
		
		scan.close();
		simpleinterest = (p*r*t)/100;
		
		System.out.println("Simple Interest is:"+simpleinterest);
		
	
		
	}

}
