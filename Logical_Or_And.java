import java.util.Scanner;
public class Logical_Or_And {

	public static void main(String[] args) 
	{
		int age, salery;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		age = sc.nextInt();
		System.out.print("Enter Salery: ");
		salery = sc.nextInt();
		sc.close();
		if(age>= 18 && salery >= 30000)
		{
			System.out.println("Rich man");
		}
		else if(age>= 18 && salery < 30000)
		{
			System.out.println("Poor man");
		}
		else if(age<18 && salery >30000)
		{
			System.out.println("Rich kid");
		}
		else
		{
			System.out.println("Poor kid");
		}
		

	}

}
