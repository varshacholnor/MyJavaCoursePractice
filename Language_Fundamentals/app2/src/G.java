class G 
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + i + (i = 2);
		System.out.println(i);
		System.out.println(j);
	}
}
/*
G.java:6: error: variable i might not have been initialized
                int j = 10 + i + (i = 2);
                             ^
1 error
*/