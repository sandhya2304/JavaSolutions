package hacker;

import java.util.Scanner;

public class AngryProfessor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter t...");
		int T = sc.nextInt();
		
		//testcases:
		for(int i=0;i<T;i++)	
		{
			System.out.println("enter n..");
			int n=sc.nextInt();
			System.out.println("Enter k..");
			int k = sc.nextInt();
			int onTime = 0;
			
			System.out.println("arrival time");
			for(int j=0;j<n;j++)
			{
				
				int arrivalTime = sc.nextInt();
				if(arrivalTime <=0)
				{
					onTime++;
				}
			}
			if(onTime >= k)
			{
				System.out.println("no time");
			}else
			{
				System.out.println("on time..");
			}
			
		}

	}

}
