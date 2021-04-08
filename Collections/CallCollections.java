package rns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class CallCollections {

	
	public void Collection() {
		Collection c=new ArrayList();
		c.add(4);
		c.add(2);
		c.add(8);
		System.out.println(c+"\n");
		System.out.println("Collection()");
	}
	public void CollectionIterator() {
		Collection c=new ArrayList();
		c.add(4);
		c.add(2);
		c.add(8);
		Iterator it=c.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println("CollectionIterator()"+"\n");
	}
	public void CollectionWhile() {
		Collection c=new ArrayList();
		c.add(4);
		c.add(2);
		c.add(8);
		Iterator it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("CollectionWhile()"+"\n");
	}
	public void CollectionList() {
		List values=new ArrayList();
		values.add(4);//Iterator value=new Iterator (4)
		values.add(6);
		values.add(9);
		values.add("Hello");
		values.add(2,2);
		values.add(9);
		Iterator it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println("CollectionList()"+"\n");
	}
	public void CollectionGenericList() {
		List<Integer> v=new ArrayList<>();
		v.add(4);
		v.add(2);
		v.add(3);
		//v.add("Hello"); Give an error while add String value to Generic Integer
		for (Integer i:v) {
			System.out.println(i);
		}System.out.println("\n");
	}
	public void CollectionClass() {
		List<Integer> v=new ArrayList<>();
		v.add(4);
		v.add(2);
		v.add(3);
		Collections.sort(v);//Sorting : Ascending
		Collections.reverse(v);//Sorting Descending
		Collections.shuffle(v);//Shuffle the values
		for (Integer i:v) {
			System.out.println(i);
		}System.out.println("\n");
	}
	public void CollectionComparator() {
		List<Integer> v=new ArrayList<>();
		v.add(404);
		v.add(209);
		v.add(302);
		Comparator<Integer> c=new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				return i%10>j%10?1:-1;
			}
		};
		for(Integer i:v) {
			System.out.println(i);
		}System.out.println("\n");
	}
	public void CollectionSet() {
		Set<Integer> v=new HashSet<>();
		v.add(4);
		v.add(2);
		v.add(3);
		v.add(2);//Duplicate value is ignore
		for (int i: v) {
			System.out.println(i);
		}System.out.println("\n");
	}
	public void CollectionSetTree() {
		Set<Integer> v=new TreeSet<>();// TreeSet For given values as Ascending Order 
		v.add(4);
		v.add(2);
		v.add(3);
		v.add(2);
		for (int i: v) {
			System.out.println(i);
		}System.out.println("\n");
	}
	public void CollectionMap() {
		Map<String,String> m=new HashMap<>();
		m.put("Name", "Rakesh");
		m.put("ID:", "03");
		m.put("Department", "EEE");
		m.put("ID", "04");
		Set<String> s=m.keySet();
		for (String k: s) {
			System.out.println(k+" "+m.get(k));
		}System.out.println("\n");
	}


}
