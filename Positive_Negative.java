/* check the given number is Positive or Negative in Java?  */
import java.util.*;
class Positive_Negative{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num;
		num = sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is positive...");
		}
		else
		{
			System.out.println("Number is Negative...");
		}
		
	}
}