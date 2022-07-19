package Practice8;

public class StringExp {
	public static void main(String[] args) {
		
        String str = "Software Developer";
        System.out.println("Length of String"+str.length());
        System.out.println("Concatenation");
        String str1 = "Java ";
        System.out.println(str1 + str);
        System.out.println(str1.concat(str));
        System.out.println("String To charArray");
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (int i= 0; i< chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("Comparison");
        String s1="Hello";
		String s2="Hai";
		System.out.println(s1.compareTo(s2));
		String x="Java";
		String y="JaVa";
		System.out.println(x.equals(y));
		
		//stringbuffer
		StringBuffer s=new StringBuffer("Welcome to Java ");
		System.out.println(s.append("Training!"));
		System.out.println(s.delete(11,14));		
		System.out.println(s.reverse());
		
		//stringbuilder
		StringBuilder st=new StringBuilder("Welcome to Java ");
		System.out.println(st.insert(0, "Hai "));
		
		//conversion
		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str); 
        System.out.println(sbr); 
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        System.out.println(sbl); 



    }

}
