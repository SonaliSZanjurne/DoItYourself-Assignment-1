/*Swap two numbers without using third variable approach 2*/

class SwapNumber2{
public static void main(String[] args){
	
	int a = 15;
	int b = 17;
	a= a*b;//5*7 =35
	b= a/b;//35/7=5
	a=a/b;//35/5=7
	System.out.println("New value for a = "+a);
	System.out.println("New value for b = "+b);
}
}