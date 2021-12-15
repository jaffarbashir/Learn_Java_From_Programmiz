/** Write a program to check weather a number is negative or not**/
import java.util.Scanner;
public class Negative_Number_Or_Not 
{	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();
		if(number>0)
		{
			System.out.println("Naah!! "+number+" is a postive number");
		}
		else if(number<0)
		{
			System.out.println("Yeah!!"+number+" is a negative number");
		}
		else
		{
			System.out.println("You have entered ZERO");
		}
	}
}
