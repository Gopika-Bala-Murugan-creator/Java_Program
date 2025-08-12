import java.util.*;

public class twoSortArrayList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first arrayList: ");
        int n1 = sc.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter the elements of the first arrayList:");
        for(int i = 0; i < n1; i++) {
		arr1.add(sc.nextInt());
	
        }

	System.out.print("Enter the size of the second arrayList: ");
        int n2 = sc.nextInt();

        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter the elements of the second arrayList:");
        for(int i = 0; i < n2; i++) {
		arr2.add(sc.nextInt());
	
        }

	ArrayList<Integer> mergedArr = new ArrayList<>();
	
	mergedArr.addAll(arr1);
	mergedArr.addAll(arr2);

	Collections.sort(mergedArr);
	System.out.println("Sorted array: "+mergedArr);

        sc.close();
    }
}