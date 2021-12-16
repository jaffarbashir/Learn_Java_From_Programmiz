//Program to make a calculator using switch case
import java.util.*;
public class Simple_Calculator_Using_Switch 
{

	public static void main(String[] args) 
	{
		int num, numb, result;
		char operator;
		String con = "Y";
		do
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a number: ");
				num = sc.nextInt();
				System.out.print("Enter another number: ");
				numb = sc.nextInt();
				System.out.println("Type in the operation you want to perform: \n 1)Addition"
					+ " (+) \n 2)Subtraction (-) \n 3)Multiplication (*)\n 4) Division (/) \n 5) Remainder (%)");
				operator = sc.next().charAt(0);
				switch(operator) 
				{
					case '+':
						result = num+numb;
						System.out.println("Addition of "+num+" and "+numb+" is: "+result);
						break;
					case '-':
						result = num-numb;
						System.out.println("Subtraction of "+num+" and "+numb+" is: "+result);
						break;
					case '/':
						result = num/numb;
						System.out.println("Division of "+num+" and "+numb+" is: "+result);
						break;
					case '*':
						result = num*numb;
						System.out.println("Multiplication of "+num+" and "+numb+" is: "+result);
						break;
					case '%':
						result = num%numb;
						System.out.println("Remainder of "+num+" and "+numb+" is: "+result);
						break;
					default:
						System.out.println("Please enter a valid operation");
				}
				
				
				System.out.println("Do you want to continue? Enter 'Y' for yes and 'N' for no.");
				con = sc.next();
				
				
			}
		
		while(con.equals("Y") || con.equals("y"));
	}

}
