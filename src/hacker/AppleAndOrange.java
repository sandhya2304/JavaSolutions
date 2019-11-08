package hacker;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int t =sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int m =sc.nextInt();
		int n =sc.nextInt();
		
		int apple = 0;
		int orange = 0;
		
		for(int i=0;i<m;i++)
		{
			int landingPlace = sc.nextInt() +a;
			if(landingPlace >= s && landingPlace <= t)
			{
				apple++;
			}	
		}
		
		for(int i=0;i<n;i++)
		{
			int landingPlace = sc.nextInt() +b;
			if(landingPlace >=s && landingPlace <= t)
			{
				orange++;
			}
		}
		System.out.println("appl "+apple);
		System.out.println("orang..."+orange);

	}

}
