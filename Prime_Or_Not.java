//Program to check weather a number is prime or not
import java.util.Scanner;
public class Prime_Or_Not 
{	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number to check weather its prime or not: ");
	int number = sc.nextInt();
	int check = 1;
	if(number>1)
	{	
	for(int i = 2; i <=number/2; i++)
	{
		if(number%i == 0)
		{
			check = 0;
			break;
		}
	}
	}
	if (check == 1)
	{
		System.out.println(number+ " is a Prime Number.");
	}
	else
	{
		System.out.println(number+ " is a Composite Number.");
	}
	
	}
}
