package labtest;

import java.util.Scanner;

public class PrimsClass 
{
	final static int MAX = 20;
	static int n;
	static int cost[][];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		ReadMatrix();
		Prims();
	}
	
	static void ReadMatrix()
	{
		int i,j;
		cost = new int[MAX][MAX];
		System.out.println("\nEnter the number of nodes:");
		n = scan.nextInt();
		System.out.println("\nEnter the adjacency matrix:\n");
		for(i = 1; i <= n; i++)
			{
				for(j = 1; j <=n; j++)
				{
					cost[i][j] = scan.nextInt();
					
					if(cost[i][j] == 0)
					{
						cost[i][j] = 999;
					}
						
				}
	
			}		
	}
	
	static void Prims()
	{
		int visited[] = new int [10];
		int ne = 1, u = 0, v = 0, min , i ,j;
		int mincost = 0;
		visited[1] = 1;
		
		while(ne < n)
		{
			for(i = 1, min = 999; i <= n; i++)
			{
				for(j = 1; j <= n; j++)
				{
					if(cost[i][j] < min)
					{
						if(visited[i] != 0)
						{
							min = cost[i][j];
							u = i;
							v = j;
						}
					}
				}
			}
			
			if(visited[u] == 0 || visited[v] == 0)
			{
				System.out.println("Edge" +ne++ +":(" +u+ "," +v+ ")" + "cost:" +min);
				mincost += min;
				visited[v] = 1;
			}
			
			cost[u][v] = cost [v][u] = 999;
		}
		
		System.out.println("\nMinimum cost:" + mincost);
		
	}
}

