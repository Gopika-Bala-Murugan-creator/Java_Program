import java.util.*;

public class TripletTargetArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the ArrayList: ");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr.get(i) + arr.get(j) + arr.get(k) == target) {
                        System.out.println(arr.get(i) + " " + arr.get(j) + " " + arr.get(k));
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No triplet found");
        }

        sc.close();
    }
}
