package practice17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class UpdateFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Writer output = null;
		File file = new File("file1.txt");
		output = new BufferedWriter(new FileWriter(file, true));
		output.write("\n Thank You!!!");
		output.close();
		System.out.println("Successfully wrote to the file.");
	}

}
