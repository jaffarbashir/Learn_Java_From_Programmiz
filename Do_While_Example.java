import java.util.Scanner;
public class Do_While_Example 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		do
		{
			System.out.println(num);
			num++;
		}
		while(num<10);
	}
}
