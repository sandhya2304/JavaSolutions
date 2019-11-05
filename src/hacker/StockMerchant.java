package hacker;

import java.util.HashMap;
import java.util.Scanner;

public class StockMerchant 
{
	public static void main(String[] args)
	{		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of colors");
        int n = sc.nextInt();
        
        HashMap<Integer,Integer> colors = new HashMap<Integer, Integer>();
        while(n --> 0)
        {
        	int c = sc.nextInt();
        	
        	Integer frequency = colors.get(c);
        	  // If new color, add to map
        	if(frequency == null)
        	{
        		colors.put(c,1);
        	}else
        	{ // Increment frequency of existing color
        		colors.put(c,frequency+1);
        	}   	
        }sc.close();
        
        // Count and print the number of pairs
        int pairs = 0;
        for(Integer frequen:colors.values())
        {
        	pairs += frequen >> 1;
        }
		System.out.println(pairs);
	}

}
