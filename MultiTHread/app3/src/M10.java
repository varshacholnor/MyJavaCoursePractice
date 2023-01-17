class Shared
{
	synchronized void test1(Shared obj)
	{
		System.out.println("from test1: " + this + " begin by " 
		+ Thread.currentThread().getName());
 	    try
	   {
		wait
	   }
	   catch (InterruptedException ex)
	   {
	      ex.printStackTrace():
	   }
        System.out.println("from test1: " + this + " end by " 
		+ Thread.currentThread().getName());
	}

	  
    synchronized void test2()
	{
		System.out.println("from test1: " + this + " begin by " 
		+ Thread.currentThread().getName());
 	    try
	    {
		   wait
	    }
	     catch (InterruptedException ex)
	    {
	     ex.printStackTrace()
	    }
		 System.out.println("from test1: " + this + " end by " 
		+ Thread.currentThread().getName());
	}
}
class Thread0 extends Thread
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
class Thread1 extends Thread
{
	Shared s1;
	Thread0(Shared s1,)
	{
		this.s1 = s1;
	}
	@Override
	public void run()
	{
		s1.test1();
	}

class M10

{
	public static void main(String[] args)

	{
      Shared s1 = new Shared();

       //Thread-0 trying to acess s1 object's test1()
		Shared s1 = new Shared();

       //Thread-0 trying to acess s2 object's test1()
       Thread1 t1 = new Thread1(s1, s2);
       t1.start();

		//Thread -1//Thread-0 trying to acess s2 object's test1()
		Thread2 t2 = new Thread2(s1,s2);
		t2.start();

		Util.sleep(5000);
		System.out.println(
	}
}
    

		
