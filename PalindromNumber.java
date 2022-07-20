import java.util.*;
class  PalindromNumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any Number to Find Palindrom Number : ");
		int n = scan.nextInt();
		int r, sum=0;
		int temp;
		temp = n;
		while (n>0)
		{
			r = n%10;
			sum = sum*10 + r;
			n = n/10;
		}

		if (temp == sum)
		{
			System.out.println("Palindro Number........."+sum);
		}
		else{
		System.out.println("Not Palindrom Number......"+sum);
		}
	}
}
