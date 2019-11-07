package hacker;

import java.util.Scanner;

public class SherlockHomes 
{
	public static void main(String[] args)
	{
		
		//sherlock and squares
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter t");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int a = sc.nextInt();
			int b =sc.nextInt();
			
			
			
			int start = (int) Math.sqrt(a);
			int end = (int) Math.sqrt(b);
			
			int sqrIntegers = start- end;
			
			sqrIntegers += (Math.pow(start,2)>= a) ? 1:0;
			
			System.out.println(sqrIntegers);
		}

	}

}
