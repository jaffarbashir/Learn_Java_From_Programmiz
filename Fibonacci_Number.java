//Program to find fibonacci Numbers
//1 1 2 3 5 8 13 21
import java.util.Scanner;
public class Fibonacci_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number upto which you want to find fibonacci series: ");
		int number = sc.nextInt();
		sc.close();
		int num1 = 0, num2 = 1,num3;
		if(number == 0)
		{
			System.out.println("Fibonacci series is: "+num1);
		}
		else if(number == 1)
		{
			System.out.println("Fibonacci series is: "+num1+ " "+num2);
		}
		else
		{	System.out.print("Fibonacci series is: "+num1+ " "+num2);
			for(int i = 2; i<=number; i++)
			{
				num3 = num1+num2;
				num1 = num2;
				num2 = num3;
				System.out.print("  " +num3);
			}
		}
		
	}

}
