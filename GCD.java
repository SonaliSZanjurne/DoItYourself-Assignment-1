/* Write a Java Program to find GCD of two given numbers. */

import java.util.*;

class GCD
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter Number 1 : ");
		a = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		b = sc.nextInt();
		int gcd = 1;
		for(int i =1;i<=a&&i<=b ;i++)
		{
			if(a%i==0&&b%i==0)
			gcd = i;
		}
		System.out.println("Greatest Common Divisor is : " +gcd);
	}
}