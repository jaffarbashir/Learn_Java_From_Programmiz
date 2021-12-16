//Program to check weather a given number is palindrome or not
import java.util.Scanner;
public class Palindrome_Number 
	{
		public static void main(String [] args)
		{
			int number;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			number = sc.nextInt();
			int original = number;
			sc.close();
			int reverse = 0;
			while(number != 0)
			{
				int rem = number % 10;
				reverse = reverse*10 + rem;
				number /= 10;
			}
			if(reverse == original )
			{
				System.out.println(reverse+" is a Palindrome number");
			}
			else
			{
				System.out.println(original+" is not a Palindrome number");
			}
		}
	}
