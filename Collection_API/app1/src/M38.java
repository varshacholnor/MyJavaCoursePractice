import java.util.HashMap;
class M38
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(null , 777);
		map.put(null , 555);
		map.put(455 , "xyz");
		map.put(99.0,true);
		map.put('a' , null);
		
		System.out.println(map);
	}
}


