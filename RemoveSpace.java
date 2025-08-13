import java.util.*;

public class RemoveSpace{
	public static void main(String[] args){
		String input = "Java is fun";
		StringBuilder result = new StringBuilder(input);

		for(int i=result.length()-1; i>=0; i--){
			if(result.charAt(i)==' '){
				result.deleteCharAt(i);
			}
		}
		System.out.println("Original: \""+input+"\"");
		System.out.println("Without spaces: \""+result.toString()+"\"");
	}
}