import java.util.*;

public class DuplicateElementFloyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while(slow != fast);


        slow = arr[0];
        while(slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        System.out.println("The duplicate element is: " + slow);

        sc.close();
    }
}
