import java.util.ArrayList;
class M6
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add("abc");
		list1.add('a');
		list1.add(true);
		System.out.println(list1);
		ArrayList list2 = new ArrayList();
		list2.add(100);
		list2.add(false);
		list2.add(list1);
		
		System.out.println(list2);
		
	}
}
