package project3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class AppendToFile {
	public static void main(String[] args) throws IOException { 
		Writer output = null;
		File myObj = new File("file.txt");
	    try {	      
	      Scanner myReader = new Scanner(myObj);  
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	      output = new BufferedWriter(new FileWriter(myObj, true));
	      output.write("\n Thank You!!!");
	      output.close();
	      System.out.println("Successfully appended to the file.");
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }  
}

