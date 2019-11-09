package hacker;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulTriplets
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int d = sc.nextInt();
		
		Set<Integer> set =new HashSet<Integer>();
		
		int beautifultriplets= 0 ;
		
		 //Build a set
		for(int i=0;i<n;i++)
		{
			int x= sc.nextInt();
			if(!set.contains(x))
			{
				set.add(x);
			}
		}
		
		
		//Check if set has a value, value+d, and value + 2d
		for(Integer digit:set)
		{
			if(set.contains(digit+d)&& set.contains(digit+(2*d)))
			{
				beautifultriplets++;
			}
		}
		
		
		System.out.println(beautifultriplets);
		
		
		

	}

}
