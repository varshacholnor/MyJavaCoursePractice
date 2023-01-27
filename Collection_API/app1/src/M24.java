import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class M24
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		ListIterator it = list.listIterator();

		while(it.hasNext())
		{
             System.out.println(it.next() + " , ");
		}

		System.out.println();
		System.out.println("----------");

         while(it.hasPrevious())
		{
			 System.out.println(it.hasPrevious() + " , ");
		}
		
		while(it.hasNext());
		{
			System.out.println(it.next() + " , ");
		}
       
	      System.out.println();
		   System.out.println("-----");
		}
	
	}
                       