import java.util.*;
class Fact_Recursion
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter the number  : ");
		a = sc.nextInt();
		int ans = fact(a);
		System.out.println("Answer is  : "+ans);

	}

public static int fact(int a)
{
	if(a==1)
	{
		return 1;
	}	
	else 
	{
		return(a*fact(a-1));
	}
	
}
}