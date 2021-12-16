//Program to generate multiplication table of numbers
import java.util.Scanner;
public class Multiplication_Table 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find multiplication table: ");
		int number = sc.nextInt();
		sc.close();
		for(int i = 1; i<=20; i++)
			{   int result = number*i;
				System.out.println(number+" x "+i+ " = "+result);
			}
			}
}
