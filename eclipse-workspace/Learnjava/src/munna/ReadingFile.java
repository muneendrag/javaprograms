package munna;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\file\\read.txt");
		BufferedReader br=new BufferedReader(file);
		String text="";
		String line=br.readLine();
		while(line!=null) {
			text=text+line;
			line=br.readLine();
		}
		//System.out.println(text);
	
	//to remaove special chars from a file
	String str2=text.replaceAll("[^a-zA-Z]", " ");
	System.out.println(str2);
	}
}
