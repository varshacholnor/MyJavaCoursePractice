import java.util.ArrayList;
class M2 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(90);
		list.add("abc");
		list.add('a');
		list.add(true);
		list.add(20.0);
		list.add(20.0);
		System.out.println(list);
	}
}
/*[90, abc, a, true, 20.0, 20.0]*/