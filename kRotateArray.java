import java.util.*;

public class kRotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
		arr.add(sc.nextInt());
	
        }

	System.out.print("Enter the K value: ");
	int k = sc.nextInt();

	k=k%n;
	for(int i=0; i<k;i++){
		int temp = arr.get(0);
		for(int j=0; j<n-1; j++){
			arr.set(j, arr.get(j+1));
		}
		arr.set(n-1,temp);
	}
	System.out.println(arr);

        sc.close();
    }
}