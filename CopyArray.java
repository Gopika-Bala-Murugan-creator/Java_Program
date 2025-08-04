import java.util.*;
import java.util.Scanner;

public class CopyArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++){
			arr[i] = sc.nextInt();
		}

		int[] copiedArray = new int[n];
        	for (int i = 0; i < n; i++) {
            		copiedArray[i] = arr[i];
        	}

        
        	System.out.println("Copied Array: " + Arrays.toString(copiedArray));
		sc.close();
		
	}
}