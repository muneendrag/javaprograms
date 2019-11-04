package munna;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollections1 {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<>();
		al1.add("munna");
		al1.add("muni");
		al1.add("kiran");
		al1.add("kishu");
		al1.add("mahesh");
		for(String obj:al1)
			System.out.println(obj);
		al1.add(1,"ntr");
		al1.add(2,"ravi");
		System.out.println(al1);
		ArrayList<String> al2=new ArrayList<>();
		al2.add("nithin");
		al2.add("kalyan");
		al1.addAll(al2);
		System.out.println(al1);
		al1.remove(0);
		System.out.println(al1);
		al1.remove("kishu");
		System.out.println(al1);
		al1.clear();
		System.out.println(al1);
		al1.add("mahesh");
		al1.add("muni");
		al1.add("kiran");
		al1.add("kishu");
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		al1.set(1,"ntr");
		System.out.println(al1);


		
		
	}

}
