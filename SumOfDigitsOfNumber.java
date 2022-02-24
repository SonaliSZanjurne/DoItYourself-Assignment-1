/*Write a Java Program to find sum of the digits of a given number. */

import java.util.*;


class SumOfDigitsOfNumber
{
	
	public static void main(String[] args)
	{
		int num;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number : ");
		num = sc.nextInt();
		int r;
		int sum=0;
		while(num!=0)
		{
			r = num%10;
			num = num/10;
			sum=sum+r;
		}
		System.out.println("Sum of Digits: "+sum);
	}
}