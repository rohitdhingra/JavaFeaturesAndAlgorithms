package algorithms;

import java.util.Scanner;

public class LargestOfN {
	public static void main(String[] args) {
		System.out.println("Finding largest and smallest of number without using array");
		System.out.println("Please enter value of N:");
		
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		System.out.println("Please Enter numbers ");
		
		for(int i=0;i<n;i++)
		{
			int current = sc.nextInt();
			if(current>largest)
			{
				largest = current;
			}
			
			if(current<smallest)
			{
				smallest = current;
			}
		}
		System.out.println("Largest of N number is:"+largest);
		System.out.println("Smallest of N number is:"+smallest);
	}
}
