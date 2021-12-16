//Program to find the factorial of a given number.
import java.util.Scanner;
public class Factorial_Of_Number 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find factorial: ");
		int num = sc.nextInt();
		sc.close();
		int factorial = 1;
		if(num == 1 || num == 0)
		{
			System.out.println("Facotial: 1");
			
		}
		else
		{
			for(int i = 2; i<=num; i++)
			{
				factorial *= i;
			}
			System.out.println("Factorial: "+factorial);
		}
	}
}
