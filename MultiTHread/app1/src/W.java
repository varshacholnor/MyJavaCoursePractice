class W
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());//5

		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());//1

		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1.getPriority());//5

		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());//10

	}
}
