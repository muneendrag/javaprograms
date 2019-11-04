package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add("hi");
		ar.add(10);
		ar.add('H');
		
		//using iterator to retrieve all the elements
		//Iterator it=ar.iterator();
		//while(it.hasNext()) {
		//	System.out.println(it.next());
		
		//using for loop to retrieve all the elements
	    for(int i=0;i<ar.size();i++) {
	    	System.out.println(ar.get(i));
	    }
	    
	    ArrayList<Integer> ar1=new ArrayList<Integer>();
	    ar1.add(10);
	    ar1.add(12);
	    //using for each to retrieve all the elements
	    
	    
	    ArrayList<String> ar2=new ArrayList<String>();
	    ar2.add("hi");
	    ar2.add("hello");
	    	
	}

}
