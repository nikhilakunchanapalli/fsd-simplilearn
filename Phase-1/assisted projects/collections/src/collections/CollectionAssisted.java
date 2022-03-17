package collections;
import java.util.*;
public class CollectionAssisted {
	public static void main(String[] args)  {
		
		//creating arraylist
		System.out.println("arrayList");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Bangalore");
		city.add("Delhi");
		System.out.println(city);
		
		//creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer>vec = new Vector<>();
		vec.addElement(15);
		vec.addElement(30);
		System.out.println(vec);
		
		//creating linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names=new LinkedList<String>();
		names.add("Anu");
		names.add("Nikki");
		Iterator<String> itr= names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			//creating hashset
			System.out.println("\n");
			System.out.println("HashSet");
			HashSet<Integer> set=new HashSet<Integer>();
			set.add(101);
			set.add(103);
			set.add(102);
			set.add(104);
			System.out.println(set);
			
			//creating linkedlist
			System.out.println("\n");
			System.out.println("LinkedHashList");
			LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
			set.add(11);
			set.add(13);
			set.add(12);
			set.add(14);
			System.out.println(set2);
		
		}
	}

}
