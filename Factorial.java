import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any Number to find Factorial :: ");
		int n=scan.nextInt();
		int fact = 1;
		for (int i=1;i<=n ;i++ )
		{
			fact = fact * i;
		}
		System.out.println("Factorial ::  "+fact);
	}
}
