package sample;

public class Gcd 
{
	static int GCD(int x, int y)
	{
		if(y==0)
			return x;
		else
			return GCD(y, x % y);
	}
	
	public static void main(String[] args) 
	{
		int x = 27, y = 72;
		System.out.println("GCD of " + x + " and " + y + " is " +GCD(x, y));
	}

}
