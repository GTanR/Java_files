package sample;

import java.util.Scanner;

public class BinarySearch 
{
	static final int MAX=1000;
	static int[]a=new int[MAX];
	
	public static void main(String args[])
	{
		int flag=-1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of elements");
		int n=sc.nextInt();
		
		System.out.println("Enter the sorted array");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter the element to search");
		int ele=sc.nextInt();
		
		sc.close();
		
		int low=0;
		
		int high=n-1;
		
		flag=bs(a,ele,low,high);
		
		if(flag!=-1)
			System.out.println("Element found at pos:"+(flag+1));
		else
			System.out.println("Element not found");
	}
	
	public static int bs(int a[],int ele,int low,int high)
	{
		
		int mid;
		if(low<=high)
		{
			mid=(low+high)/2;
			
			if(ele==a[mid])
				return mid;
			
			else if(ele<a[mid])
				return bs(a,ele,low,mid-1);
			else
				return bs(a,ele,mid+1,high);
		}
		else
		 return -1;
		
	}

}