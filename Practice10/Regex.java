package Practice10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String text = "Regular Expressions 123";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(text);
		
		while (c.find()) {
	      	System.out.println( text.substring( c.start(), c.end() ) );
		}
		System.out.println();
		System.out.println("helloo".matches("hello+"));
		System.out.println();
		String[] words = {"cat", "care", "cars", "car", "carry", "crow","sheet","keep","feed"};
	    
	    for(String word: words){
	        if(word.matches("care?"))
	            System.out.print(word + " ");
	    }
	    System.out.println("\n");
	    for(String word: words){
	        if(word.matches("ke{2}p"))
	            System.out.print(word + " ");
	    }
		
	}
}
