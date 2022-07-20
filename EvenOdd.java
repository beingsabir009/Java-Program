import java.util.*;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any Number to find Even/Odd number");
		int n = scan.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number...");
		}
		else{
			System.out.println("Odd Number....");
	}
	}
}
