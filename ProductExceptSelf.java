import java.util.*;
import java.util.Scanner;

public class ProductExceptSelf{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n;i++){
			arr[i] = sc.nextInt();
		}

		int[] output = new int[n];
		output[0]=1;
		for(int i=1; i<n; i++){
			output[i]=output[i-1]*arr[i-1];
		} 

		int suffix =1;
		for(int i=n-1; i>=0; i--){
			output[i] *= suffix;
			suffix *= arr[i];
		}

		System.out.println("Output: " + Arrays.toString(output));
			
		sc.close();
		
	}
}