import java.util.*;
import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		int org = num;
		int sum =0;

		while(num>0){
			int digit = num%10;
			sum += digit*digit*digit;
			num/=10;
		}

		if(sum==org) System.out.println(org+" is an Armstrong number");
		else System.out.println(org+" is not an Armstrong number");
		sc.close();
	}
}

