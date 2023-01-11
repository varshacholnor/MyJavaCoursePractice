class I
{
	public static void main(String[] a)
	{
		int x = 0;
		int y = x++ + x++ + x++ + x;
		System.out.println(x);
		System.out.println(y);
	}
}

/*
3
6
*/