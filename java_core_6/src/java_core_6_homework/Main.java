package java_core_6_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		
		String qwer = "578-asd-3-alh-31-e-496-a-0-r-e";
		System.out.println(qwer);

		Pattern pat=Pattern.compile("[-]?[0-9]+(.[0-9]+)?"); 
		Matcher matcher=pat.matcher(qwer); 
		while (matcher.find()) { 
		System.out.println(matcher.group()); 
	}

}
}