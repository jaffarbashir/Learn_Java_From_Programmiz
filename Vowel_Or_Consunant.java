import java.util.Scanner;
public class Vowel_Or_Consunant 
{
	public static void main(String [] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character to check: ");
		char character = sc.next().charAt(0);
		sc.close();
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' 
				|| character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
		{
			System.out.println(character +" is vowel");
		}
		else
		{
			System.out.println(character +" is consunant");
		}
	}
}
