//program to illustrate the use of break statement in Java
import java.util.Scanner;
public class Break_Statement_In_Java {

	public static void main(String[] args) 
	{
		int number = 50,inp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for which you want to check divisibility: ");
		inp = sc.nextInt();
		sc.close();
		while(true)
		{
			if(number % inp == 0)
			{	System.out.println("The number grater than 50 which is divisible by 9 is: " +number);
				break;
			}
			number++;
		}
	}

}
