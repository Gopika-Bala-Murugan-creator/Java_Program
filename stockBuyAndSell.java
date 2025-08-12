import java.util.*;

public class  stockBuyAndSell{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
		arr.add(sc.nextInt());
	
        }

	int sum =0;
	for(int i=1; i<n;i++){
		if(arr.get(i)>arr.get(i-1)){
			sum += arr.get(i)-arr.get(i-1);
		}
	}
	System.out.println("Total profit: "+sum);

        sc.close();
    }
}