package practice17;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {  
  public static void main(String[] args) {  
    try {  
      FileWriter myWrite = new FileWriter("file1.txt");
      myWrite.write("Welcome to Java FSD Training!");
      myWrite.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
  }  
}