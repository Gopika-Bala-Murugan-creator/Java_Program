import java.util.*;
import java.util.Scanner;

public class CountTargetElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++){
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the target element: ");
		int target = sc.nextInt();
		int count =0;

		for(int i=0; i<n;i++){
			if(arr[i] == target){
				count++;
				
			}
		}
		System.out.println("Frequency of the target element: "+count);
		sc.close();
		
	}
}