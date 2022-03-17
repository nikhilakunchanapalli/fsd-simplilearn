package demoMap;
import java.util.*;
public class DemoMap 
{
	public static void main(String[] args)
	{
		{
			HashMap<String, Integer> contacts = new HashMap<>();
			contacts.put("User1", 10000023);
			contacts.put("User2", 20000026);
			contacts.put("User3", 30000022);
			contacts.put("User4", 40000028);
			contacts.put("User5", 50000029);
			
			System.out.println("contacts");
			Set<String> keys = contacts.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext())
			{
				String key = it.next();
				System.out.println(key + ":" + contacts.get(key));
	}
	}
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "Tinku");
		hm.put(2,"Ruby");
		hm.put(3, "Cutie");
		
		System.out.println("\n The element of HashMap are");
		for(Map.Entry m:hm.entrySet())
			 {
			System.out.println(m.getKey()+" "+m.getValue());
		      }
		//HashTable
		
		Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
		
		ht.put(4, "Nikki");
		ht.put(5, "Peppi");
		ht.put(6, "Naga");
		ht.put(7, "Puji");
		ht.put(7, "Pappi");//duplicate values
	
	System.out.println("\n The elements of HashTable are");
	for(Map.Entry n:ht.entrySet())
	{
		System.out.println(n.getKey()+" "+n.getValue());
		}
	
	//TreeMap
	
	TreeMap<Integer,String> map= new TreeMap<Integer, String>();
	map.put(8, "Kanna");
	map.put(9, "Catie");
	map.put(10, "Nikki");
	map.put(8, "Priya");
	
	System.out.println("\n The elements of Treemap are ");
	for(Map.Entry l:map.entrySet())
			{
		System.out.println(l.getKey()+" "+l.getValue());
		
			}
	
	}
}
	
	
	
	
	
	
	
	

