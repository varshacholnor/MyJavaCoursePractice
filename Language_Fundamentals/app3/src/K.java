class K
{
	public static void main(String[] a)
	{
		int i = 0 ;
		int j = i++ + i + i-- + i;//0 + 1 + 1 + 0
		System.out.println(i);
		System.out.println(j);
	}
}
/*
0
2
*/