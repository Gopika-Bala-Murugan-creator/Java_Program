import java.util.*;
import java.util.Scanner;

public class GuessTheNumber{
	public static void main(String[] args){
		int secretNum =7;
		int num;
		Scanner sc = new Scanner(System.in);

		do{
			num = sc.nextInt();
			if(num>secretNum){
				System.out.println("Too high - Try again");
			}
			else if(num<secretNum){
				System.out.println("Too Low - Try again");
			}
		}while(secretNum != num);
		System.out.println("you're guess is correct");
		sc.close();
	}
}