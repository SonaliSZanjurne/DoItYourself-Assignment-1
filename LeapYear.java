/* Write a Java Program to find whether given number is Leap year or NOT? */

import java.util.*;

class LeapYear
{

	public static void main(String[] args)
	{
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year;
		year = sc.nextInt();
		if(year % 4 ==0 || year %100 ==0 || year %400==0)
		{
			System.out.println("Leap Year...");
		}
		else
		{
			System.out.println("Non-Leap Year...");
		}
	}

}