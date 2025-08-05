import java.util.*;
import java.util.Scanner;

public class LinearSearch{
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
		int found =0;

		for(int i=0; i<n;i++){
			if(arr[i] == target){
				System.out.println("Index of the target element: "+i);
				found++;
				break;
				
			}
		}
		if(found==0){
			System.out.println("Element not found");
		}	
		sc.close();
		
	}
}