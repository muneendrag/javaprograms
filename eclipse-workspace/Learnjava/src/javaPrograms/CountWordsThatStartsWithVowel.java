package javaPrograms;

public class CountWordsThatStartsWithVowel {

	public static void main(String[] args) {
		
//		String str="Hi,hello India is the most beautiful country in the world.";
//		int l=str.length();
//        int pos=0;
//        char ch1, ch2;
//        String w;
//        for(int i=0; i<l; i++)
//        {
//            ch1 = str.charAt(i);
//            if(ch1 == ' ')
//            {
//                w = str.substring(pos,i); // extracting words one by one
//                ch2 = w.charAt(0);
//                if(ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U' ||
//                ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u')
//                {
//                    System.out.println(w);
//                }
//                pos = i+1;
//            }
//        }
//    }
//	}
	int count=0;
		String input = "In that period I was a student in the bad college unfortunately";
		String[] text = input.split(" ");
		for(String word: text){
		if(word.matches("^[Aa,Ii,Oo,Uu,Ee].*"))
		    System.out.println(word+" matches");
			count++;
		    break;
		}
	}
}
