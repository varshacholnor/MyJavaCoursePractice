class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		
		System.out.println("main end");
	}
}
//main begin
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//main end