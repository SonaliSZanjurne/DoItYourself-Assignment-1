import java.io.*;
class SwapNumber3{
public static void main(String[] args){
	
	int x = 5; //0101
	int y = 7; //0111
	// using bitwise XOR opration
	x = x^y; // 0101 ^ 0111 = 0010 = 2
	y =x^y; //0010 ^ 0111 = 0101 = 5
	x = x^y; // 0010 ^ 0101 = 0111 = 7
	System.out.println("New value for x = "+x);
	System.out.println("New value for y = "+y);

}
}