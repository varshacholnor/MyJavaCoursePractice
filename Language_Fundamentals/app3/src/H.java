class H
{
	public static void main(String[] a)
	{
		int i = 0;
		int j = i-- + i + i-- + i;
		System.out.println(i);
		System.out.println(j);
	}
}

/*
-2
-4
*/