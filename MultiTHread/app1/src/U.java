class U 
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());

		t1.setDaemon(true);
		System.out.println(t1.isDaemon());

	}
}
//false
//Exception in thread "main" java.lang.IllegalThreadStateException
//        at java.lang.Thread.setDaemon(Thread.java:1364)
//        at U.main(U.java:8)