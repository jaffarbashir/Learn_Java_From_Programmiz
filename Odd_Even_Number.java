//Program to check weather a number is odd or even.
import java.util.Scanner;
public class Odd_Even_Number 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();
		if(number%2 == 0)
		{
			System.out.println(number+" is an Even number.");
		}
		else
		{
			System.out.println(number+" is ODD number.");
		}
	}
}
