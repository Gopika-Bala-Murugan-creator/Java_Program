import java.util.*;
import java.util.Scanner;

public class VowelandConsonant{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().toLowerCase().charAt(0);
		
		if(!Character.isLetter(ch)){
			System.out.println("Invalid Character");
		}
		else{
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				System.out.println(ch +" is a vowel");
			}
			else{
				System.out.println(ch+" is a consonant");
			}
		}
		sc.close();
	}
}

		
		