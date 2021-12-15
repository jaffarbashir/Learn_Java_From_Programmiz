//Program to illustrate the use of continue statement
public class Even_Odd_Using_Continue_Statement
{

	public static void main(String[] args) 
	{
		int a = 10;
		for(int i = 0; i<10; i++)
		{	
			if(i%2 == 0)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
