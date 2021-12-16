//Program to find the gcd of two numbers
import java.util.Scanner;
public class Find_GCD_Of_Two_numbers 
{

	public static void main(String[] args) 
	{
		int number1, number2, result =1, smaller;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		number1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		number2 = sc.nextInt();
		if(number1>number2)
		{
			smaller = number2;
		}
		else {
			smaller = number1;
		}
		for(int i = 1; i<=smaller; i++)
		{
			if(number1%i == 0 && number2%i ==0)
			{
				result = i;
			}
		}
		System.out.println("GCD: " +result);
	}

}
