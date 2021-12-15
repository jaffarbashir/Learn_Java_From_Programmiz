import java.util.*;
public class Swap_Two_Numbers 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter another: ");
		int num2 = sc.nextInt();
		System.out.println("================Numbers before swapping: =====================");
		System.out.println("Number1: "+num1+" \nNumber2: "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("================Numbers After swapping: =====================");
		System.out.println("Number1: "+num1+" \nNumber2: "+num2);
	}
}
