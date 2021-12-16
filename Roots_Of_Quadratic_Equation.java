//Program to calculate the roots of a quadratic equation.
import java.util.Scanner;
public class Roots_Of_Quadratic_Equation 
{
	public static void main(String [] args)
	{
		int a,b,c;
		double root1, root2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		b = sc.nextInt();
		System.out.print("Enter the value of c: ");
		c = sc.nextInt();
		String equation = a+"x^2 + "+b+"x +" +c;
		System.out.println("Given equation is: "+equation);
		int d = b*b - 4*a*c;
		if(d>=0)
		{	
			root1 = (-b + Math.sqrt(d))/(2*a);
			root2 = (-b-Math.sqrt(d))/(2*a);
			System.out.println("Real roots exists");
			System.out.println("Root1: "+root1+ "\n Root2: "+root2);
		}
		else
		{
			System.out.println("Real roots doesnt exists of the equation: "+equation);
		}
	}
}
