// Program to find the lcm of two numbers
import java.util.Scanner;
public class Lcm_Of_Two_Numbers 
{
	public static void main(String [] args)
	{
		int num1, num2,lcm,maximum_no;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num1 = sc.nextInt();
		System.out.print("Enter another number: ");
		num2 = sc.nextInt();
		if(num1>num2)
		{
			maximum_no = num1;
		}
		else
		{
			maximum_no = num2;
		}
		for(int i = 0; i<= num1*num2; i++)
		{
			if(maximum_no % num1 == 0 && maximum_no %num2 ==0)
			{
				System.out.println("LCM: " +maximum_no);
				break;
			}
			maximum_no++;
		}
	}
}
