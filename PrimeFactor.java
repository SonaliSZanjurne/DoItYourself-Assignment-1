/* Write a Java Program to print all the Prime Factors of the Given Number.*/

import java.util.*;

class PrimeFactor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter Number : ");
		num = sc.nextInt();
		System.out.print("Prime Factors are : ");
		int p = 2;
		while(num>1)
		{
			if(num%p==0)
			{
				System.out.print(p+ " ");
				num = num/p;
			}
			else
			{
				p++;
			}
						
		}
	}
}