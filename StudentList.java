import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {

//		Check arguments
		if(args[0].equals("a")) {
			System.out.println("Loading data ...");			
			try {
			BufferedReader bufferreader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String lines = bufferreader.readLine();
			String words[] = lines.split(",");			
			for(String word : words) { System.out.println(word); }
			} catch (Exception e){} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].equals("lines")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader bufferreader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String lines = bufferreader.readLine();
			//System.out.println(lines);
			String words[] = lines.split(",");	
			Random x = new Random();
				int y = x.nextInt(3);
					System.out.println(words[y]);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");
		}
		else if(args[0].contains("+")){
			System.out.println("Loading data ...");			
			try {
			BufferedWriter bufferreader = new BufferedWriter(
					new FileWriter("students.txt", true));
			String t = args[0].substring(1);
	        Date d = new Date();
	        String df = "dd/mm/yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(df);
	        String fd= dateFormat.format(d);
			bufferreader.write(", "+t+"\nList last updated on "+fd);
			bufferreader.close();
			} catch (Exception e){}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader bufferreader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String lines = bufferreader.readLine();
			String words[] = lines.split(",");	
			boolean done = false;
			String t = args[0].substring(1);
			for(int idx = 0; idx<words.length && !done; idx++) {
				if(words[idx].equals(t)) {
					System.out.println("We found it!");
						done=true;
				}
			}
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")) 
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader bufferreader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String D = bufferreader.readLine();
			char a[] = D.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char c:a) {
				if(c ==' ') 
				{
					if (!in_word) {	count++; in_word =true;	}
					else { in_word=false;}			
				}
			}
			System.out.println(count +" word(bufferreader) found " + a.length);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
	}
}