import java.util.*;
import java.util.Scanner;

public class HasDuplicates{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++){
			arr[i] = sc.nextInt();
		}

		boolean found =true;

		for(int i=0; i<n;i++){
			for(int j=i+1; j<n;j++){
				if(arr[i] == arr[j]){
					found= true;
					System.out.println("contain duplicates: "+found);
					break;
				
				}
			}
		}
		if(found==false){
			System.out.println("contain duplicates: "+found);
		}	
		sc.close();
		
	}
}