//Program to calculate the sum of natural numbers
import java.util.Scanner;
public class Sum_Of_Natural_Numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a natural number upto which you wan to find the sum: ");
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 0 ; i<=number; i++)
		{
			sum +=i;
		}
		System.out.println("The sum of "+number+ " natural numbers is: "+sum);
	}

}
