package oopsConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("muni");
		ll.add("munna");
		ll.add("reddy");
		ll.add("mahesh");
		ll.add("ntr");
		System.out.println("contents of ll:"+ll);
		//using iterator
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//addFirst
		ll.addFirst("ram");
		//addLast
		ll.addLast("charan");
		System.out.println("contents of ll:"+ll);
		//get:
		System.out.println(ll.get(4));
		//set:
		ll.set(0, "kiran");
		System.out.println(ll.get(0));
		//remove:
		ll.remove(1);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contents of ll:"+ll);

		

		


		
	}

}
