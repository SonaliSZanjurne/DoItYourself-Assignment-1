/* Write a java program to LCM of TWO given number. */

// LCM = n1*n2/gcd

import java.util.*;

class LCM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter number 1 : ");
		a = sc.nextInt();
		System.out.print("Enter number 2 : ");
		b = sc.nextInt();
		int gcd = 1;
		for(int i = 1 ; i<=a&&i<=b; i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd = i;
			}
		}
		int lcm = (a*b)/gcd;
		System.out.print("Least Common Multiple is : "+lcm);
	}
}