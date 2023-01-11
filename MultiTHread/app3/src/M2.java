class Shared
{
	synchronized void test1()
	{
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 20; i++)
		{
			System.out.println("from test1: " + i + " by " + t1.getName());
		}
	}

	void test2()
	{
		Thread t1 = Thread.currentThread();
		for(int i = 1; i <= 20; i++)
		{
			System.out.println("from test2: " + i + " by " + t1.getName());
		}
	}
}
class Thread1 extends Thread
{
	Shared s1;
	Thread1(Shared s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run()
	{
		s1.test1();
	}
}
class Thread2 extends Thread
{
	Shared s1;
	Thread2(Shared s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run()
	{
		s1.test1();
	}
}
class M2
{
	public static void main(String[] args)
	{
		Shared s1 = new Shared();

		Thread1 t1 = new Thread1(s1);
		Thread2 t2 = new Thread2(s1);

		t1.start();
		t2.start();

		s1.test1();
	}
}
from test1: 1 by main
from test1: 2 by main
from test1: 3 by main
from test1: 4 by main
from test1: 5 by main
from test1: 6 by main
from test1: 7 by main
from test1: 8 by main
from test1: 9 by main
from test1: 10 by main
from test1: 11 by main
from test1: 12 by main
from test1: 13 by main
from test1: 14 by main
from test1: 15 by main
from test1: 16 by main
from test1: 17 by main
from test1: 18 by main
from test1: 19 by main
from test1: 20 by main
from test1: 1 by Thread-1
from test1: 2 by Thread-1
from test1: 3 by Thread-1
from test1: 4 by Thread-1
from test1: 5 by Thread-1
from test1: 6 by Thread-1
from test1: 7 by Thread-1
from test1: 8 by Thread-1
from test1: 9 by Thread-1
from test1: 10 by Thread-1
from test1: 11 by Thread-1
from test1: 12 by Thread-1
from test1: 13 by Thread-1
from test1: 14 by Thread-1
from test1: 15 by Thread-1
from test1: 16 by Thread-1
from test1: 17 by Thread-1
from test1: 18 by Thread-1
from test1: 19 by Thread-1
from test1: 20 by Thread-1
from test1: 1 by Thread-0
from test1: 2 by Thread-0
from test1: 3 by Thread-0
from test1: 4 by Thread-0
from test1: 5 by Thread-0
from test1: 6 by Thread-0
from test1: 7 by Thread-0
from test1: 8 by Thread-0
from test1: 9 by Thread-0
from test1: 10 by Thread-0
from test1: 11 by Thread-0
from test1: 12 by Thread-0
from test1: 13 by Thread-0
from test1: 14 by Thread-0
from test1: 15 by Thread-0
from test1: 16 by Thread-0
from test1: 17 by Thread-0
from test1: 18 by Thread-0
from test1: 19 by Thread-0
from test1: 20 by Thread-0*/
