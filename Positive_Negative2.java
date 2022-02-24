/* check the given number is Positive or Negative in Java?  approach - 2*/

import java.lang.Integer.*;
import java.util.*;

class Positive_Negative2
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number  : ");
	int num;
	num = sc.nextInt();
	int res;
	res = Integer.signum(num);
	System.out.println(res);

}