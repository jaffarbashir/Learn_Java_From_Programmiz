import java.util.*;
public class Multiply_Two_Numbers 
{	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num1 = sc.nextInt();
	System.out.print("Enter another number: ");
	int num2 = sc.nextInt();
	int result = num1*num2;
	System.out.println("Multiplication of "+num1+" and "+num2+ " is: "+result);
	
}
}