class E 
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + i;	
		System.out.println(i);
		System.out.println(j);
	}
}


/*
error: variable i might not have been initialized
                int j = 10 + i;
                             ^
1 error

*/