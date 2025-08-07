import java.util.*;
import java.util.Scanner;

public class SumAndAverage{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++){
			arr[i] = sc.nextInt();
		}
		int sum =0;
		for(int i=0; i<n;i++){
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+sum/n);
		sc.close();
	}
}