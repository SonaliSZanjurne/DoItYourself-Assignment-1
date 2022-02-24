/*Swap two numbers without using third variable approach 1*/

class SwapNumber
{
public static void main(String[] args)
{
	int a=5;
	int b= 7 ;
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	System.out.println("New value of a : "+a);
	
	System.out.println("New value of b : "+b);
}
}