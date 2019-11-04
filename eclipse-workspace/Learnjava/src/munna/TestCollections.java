package munna;



import java.util.ArrayList;
import java.util.Iterator;

public class TestCollections {
	public static void exArrayList() {
	//ArrayList<String> al=new ArrayList<>();
    ArrayList<String> al=new ArrayList<String>();
	al.add("munna");
	al.add("muni");
	al.add("kiran");
	al.add("kishu");
	al.add("mahesh");
	al.add("sai");
	Iterator<String> it=al.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	}
	public static void main(String[] args) {
		exArrayList();
	}
	

}
