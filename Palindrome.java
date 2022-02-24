/* Check whether the Given Number is a Palindrome or NOT. */

import java.util.*;


class Palindrome
{
	
	public static void main(String[] args)
	{
		int num;
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter number : ");
		num = sc.nextInt();
		int r;
		int rev_num=0;
		int pal_num = num;
		while(num!=0)
		{
			r = num%10;
			num = num/10;
			rev_num=(rev_num*10)+r;
			
		}
		if(pal_num == rev_num)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is NOT Palindrome");
		}
	}
	
}