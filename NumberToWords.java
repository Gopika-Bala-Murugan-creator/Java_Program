import java.util.*;

public class NumberToWords{
	public static void main(String[] args){
		String str = "9344";
		String[] words = {"zero", "one", "two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		String result ="";

		for(int i=0; i<str.length(); i++){
			int digit = str.charAt(i)-'0';
			result+= words[digit]+ " ";
		}
		System.out.println(result);
	}
}