import java.util.*;

public class RemoveString{
	public static void main(String[] args){
		String input = "abc123def456";
		StringBuilder result = new StringBuilder();

		for(int i=0; i<input.length(); i++){
			char ch = input.charAt(i);
			if(!Character.isDigit(ch)){
				result.append(ch);
			}
		}
		System.out.println("Original: "+input);
		System.out.println("Without Digit: "+result.toString());
	}
}