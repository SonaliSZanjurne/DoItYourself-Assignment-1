/*Write a Java Program to print the digits of a Given Number. */

import java.util.*;


class DigitsOfNumber
{
	
	public static void main(String[] args)
	{
		int num;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number : ");
		num = sc.nextInt();
		int r;
		System.out.println("Digits are as follows : ");
		while(num!=0)
		{
			r = num%10;
			System.out.println(r);
			num = num/10;
		}
	}
}