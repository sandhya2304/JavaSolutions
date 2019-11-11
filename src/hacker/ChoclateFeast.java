package hacker;

import java.util.Scanner;

public class ChoclateFeast {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int c =sc.nextInt();
			int m =sc.nextInt();
			
			int ate = 0;
			int choclates = n/c;
			ate += choclates;
			
			while(choclates >= m)
			{
				ate += choclates /m;
				choclates = (choclates/m) + (choclates % m);
			}
			System.out.println(ate);
		}
		
		

	}

}
