class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ");
		int n=scan.nextInt();
		int count;
		for(int i=2;i<=n;i++){
			count = 0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count == 2)
				System.out.print(i+" ");
		}
	}
}
