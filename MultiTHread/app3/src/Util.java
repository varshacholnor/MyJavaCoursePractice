class Util 
{
	public static void sleep(long milles) 
	{
		try
		{
			Thread.sleep(milles);
		}
		catch (InterruptedException ex)
		{
			System.out.println("Interruption Handled");
			ex.printStackTrace();
		}
	}
	public static void sleep(long milles, int nano)
	{
		try
		{
			Thread.sleep(milles, nano);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
