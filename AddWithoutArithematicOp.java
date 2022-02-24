/*How to add two numbers without using the arithmetic operators in Java?*/

import java.util.*;

class AddWithoutArithematicOp

{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Enter Number 1 : ");
		a = sc.nextInt();
		System.out.print("Enter Number 2 : ");
		b = sc.nextInt();
		for(int i = 1; i<=b;i++)
		{
			a++;
		}
		System.out.println("Addition : " +a);
	}
}