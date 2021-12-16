// Program to reverse a number
import java.util.Scanner;
public class Reverse_Number 
{
	public static void main(String [] args)
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to reverse: ");
		number = sc.nextInt();
		System.out.println("Original Number: "+number);
		int reverse = 0;
		while(number != 0 ) 
		{
			int rem = number%10;
			reverse = reverse*10+rem;
			number = number/10;
		}
		System.out.println("Reversed Number: "+reverse);
	}
}
