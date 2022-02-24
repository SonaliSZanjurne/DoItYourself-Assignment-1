/*Write a java program to Reverse a given number. */

import java.util.*;


class ReverseNumber
{
	
	public static void main(String[] args)
	{
		int num;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number : ");
		num = sc.nextInt();
		int r;
		int rev_num=0;
		while(num!=0)
		{
			r = num%10;
			num = num/10;
			rev_num=(rev_num*10)+r;
		}
		System.out.println("Reverse of Number is : "+rev_num);
	}
}