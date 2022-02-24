/* Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol?  */

import java.util.*;

class SmallestNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.print("Enter Number 1 : ");
		a = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		b = sc.nextInt();
		System.out.print("Enter Number 3 : ");
		c = sc.nextInt();
		d = 0;
		while(a!=0&& b!=0&&c!=0)
		{
			a--;
			b--;
			c--;
			d++;
		}
		System.out.println("Smallest Number is : " +d);
	}
}
