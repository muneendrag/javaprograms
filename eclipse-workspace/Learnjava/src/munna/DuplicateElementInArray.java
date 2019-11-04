package munna;

import java.util.HashSet;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		String[] myarray= {"abc","xyz","lmn","xyz","abc","pqr"};
		HashSet<String> set=new HashSet<String>();
		for(String arrayelement:myarray) {
			if(!set.add(arrayelement))
			{
				System.out.println("duplicate:"+arrayelement);
			}
		}
	}

}
