class K1
{
	public static void main(String[] a)
	{
		int x = 0;
		int y = x++ + x++ + x++ + x + x;//0 +1 +2 + 3 + 3
		System.out.println(x);
		System.out.println(y);
	}
}

/*
3
9
*/