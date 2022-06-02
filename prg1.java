class Program1
{
	public static int findNextSeries(int n)
	{
		return (int) (3 * Math.pow(n,2) - n + 2)/(2);
	}
	
	public static boolean isEightLastDigit(int n)
	{
		boolean status = false;
		if(n%10 == 8)
			status = true;
		return status;
	}
	
	public static void main(String args[])
	{
		int series[]=new int[100];
		int eightCounter=0;
		for(int i=0; i<100; i++)
		{
			series[i] = findNextSeries(i);
			System.out.print(series[i]);
			System.out.print(",");
		}
		
		
		System.out.println("\n"+ "Numbers ending with 8");
		for(int i =0;i<100; i++)
		{
			if(isEightLastDigit(series[i]))
			{
				eightCounter++;
				System.out.print(series[i] + ",");
			}
		}
		System.out.println("\nCount of numbers: " + eightCounter);
		
	}
	
}