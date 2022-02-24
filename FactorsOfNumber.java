/* .Write a Java Program to print all the Factors of the Given number. */

import java.util.*;

class FactorsOfNumber
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = sc.nextInt();
		System.out.println("Factors of Number are : ");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
			
		}
	
	}
}