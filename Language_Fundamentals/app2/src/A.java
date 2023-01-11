class A
{
	public static void main(String[] args)
	{
		int i;
		int j = i;
		System.out.println(i);
		System.out.println(j);
	}

}



/*
A.java:6: error: variable i might not have been initialized
                int j = i;
                        ^
1 error
/*
