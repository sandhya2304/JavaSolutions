package hacker;

import java.util.Scanner;

public class BeautifulDayMovie {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		int j = sc.nextInt();
		
		int k = sc.nextInt();
		
		int beautifulDays = 0;
		
		for(int a = i ;a <= j;a++ )
		{
			StringBuilder day = new StringBuilder(String.valueOf(a));
			int xRevers = Integer.parseInt(day.reverse().toString());
			
			if(Math.abs(a-xRevers)%k==0)
			{
				beautifulDays++;
			}
			
		}
		System.out.println(beautifulDays);
		
		
		
	}

}
