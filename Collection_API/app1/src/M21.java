import java.util.ArrayList;
import java.util.Collections;
class A implements Comparator;
{
	int i, j;
	       A(int i, int j)
	{
			   this.i = i;
			    this.j = j;
	}
	public String toString()
	{
		return "(i = " + i + " , " + j + ")";
	}
}
class SortBasedOnIValue implements Comparator
{
	public int compareTo(Object o1, Object o2)
	{
		A a1 = (A)o1;
		A a1 = (A)o1;

		int result = i -((A)obj).i;
		System.out.println("comaring " + this.i + "and" + "argument object i: " + obj + " and the result: " + result);
		return result;
	}
}
class M21
{
     public static void main(String[] args) 
	{
		
		ArrayList list = new ArrayList();
		list.add(new A(10));
		list.add(new A(100));
		list.add(new A(20));
		list.add(new A(30));
		list.add(new A(18));
		list.add(new A(5));
		System.out.println(list);
        Collections.sort(list);
		System.out.println(list);
		
	}
}


