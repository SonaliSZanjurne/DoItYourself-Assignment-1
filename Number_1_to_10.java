/*Write a Java Program to Print 1 To 10 Without Using Loop. */

class Number_1_to_10
{
	public static void main(String[] args)
	{
	  int initial = 1;
	  int last  = 10;
	  printnumber(initial,last);
	}
	
	public static void printnumber(int initial, int last)
	{
		if(initial<=last)
		{
			System.out.println(initial + " ");
			printnumber(initial + 1, last);
		}
	}
}