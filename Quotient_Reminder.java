import java.util.*;
public class Quotient_Reminder 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		int quotient = num1/num2;
		int remainder = num1%num2;
		System.out.println("The quotient and remainder of "+num1+" and "+num2+ " is "+quotient+ " and "+ remainder);
	}
}
