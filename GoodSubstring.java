import java.util.*;

public class GoodSubstring{
	public static void main(String[] args){
		String str ="abcbcdac";
		
		if(str.length()<3) System.out.print("0");
		
		int count=0;
		for(int i=0; i<str.length()-3; i++){
			char a = str.charAt(i);
			char b = str.charAt(i+1);
			char c = str.charAt(i+2);

			if(a!=b && a!=c && b!=c){
				count++;
			}
		}
		System.out.print("The total number of good SubString: "+count);
	}
}