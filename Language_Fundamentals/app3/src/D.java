class D
{
	public  static void main(String[] a)
	{
		int i = 0;
		int j = i--;
		System.out.println(j);
		System.out.println(i);
		System.out.println(j);
        System.out.println(i);
	}
}
/*
0
-1
0
-1
*/
