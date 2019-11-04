package javaPrograms;

public class OccurancesOfCharacterInString {

	public static void main(String[] args) {
		
		String str="Java Programming Java oops";
		//count of specific character occurances
		int total_count=str.length();
		int total_count_afterremove=str.replace("a", "").length();
		int count=total_count-total_count_afterremove;
		System.out.println(count);
	}
}
