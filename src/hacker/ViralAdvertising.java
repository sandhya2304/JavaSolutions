package hacker;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int peopleReached = 2;
		int peopleSharing = 2;
		
		for(int i = 1; i <n;i++)
		{
			peopleReached +=(peopleSharing*3)/2;
			peopleSharing +=(peopleSharing*3)/2;			
		}
		System.out.println("people rech..."+peopleReached);

	}

}
