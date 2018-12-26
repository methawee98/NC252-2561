package myAppDictionary;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class filee {

	public static void main(String[] args) throws IOException {
		 linkVorcab test = new linkVorcab(50000);
		FileReader file = new FileReader("vocab.txt");
		  BufferedReader Readf = new BufferedReader(file);
		  String text ;
		  while ((text = Readf.readLine()) != null) {
			String[] tokens = text.split("\t");
			  System.out.println(tokens[2]);
			  test.insert(tokens[0],tokens[1],tokens[2]);
		           
		    
		        }
			  
		
		  
		
	}

}
