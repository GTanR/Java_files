package sample;

import java.util.*;

class arrayStack
{
	static int arr[ ];
	static int top, max;
	static Scanner sc = new Scanner(System.in);
	
	arrayStack(int n)
	{
		max = n;
		arr = new int[max];
		top = -1;
	}
	
	static void push(int i)
	{
		int ele;
		if (top == max - 1)
			System.out.println("Stack Overflow");
		else
			System.out.println("Enter integer element to push");
			ele = sc.nextInt();
			arr[++top] = i;
	}
	
	void pop( )
	{
		if (top == -1)
			System.out.println("Stack Underflow");
		else
		{
			int element = arr[top--];
			System.out.println("Popped Element: " + element);
		}
	}
	
	void display( )
	{
		System.out.print("\nStack = ");
		if (top == -1)
		{
			System.out.print("Empty\n");
			return;
		}
		for (int i = top; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println( );
	}
}

class Stack
{
	static int p;
	
	public static void main(String[ ] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Size of Integer Stack ");
		int n = scan.nextInt( );
		
		boolean done = false;
		
		arrayStack stk = new arrayStack(n);
		
		do
		{
			System.out.println("\nStack Operations");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. display");
			System.out.println("4. Exit\n");
			
			System.out.println("Enter your choice:");
			int choice = scan.nextInt( );
			
			switch (choice)
			{
				case 1:
					arrayStack.push(p);
					break;
				
				case 2:
					stk.pop( );
					break;
				
				case 3:
					stk.display( );
					break;
				
				case 4:
					done = true;
					break;
				
				default:
					System.out.println("Wrong Entry \n ");
					break;
			}
			
		}	while (!done);
	
		scan.close();
	}
}
