import java.util.*;

public class MergeRemoveSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {4, 6, 11, 15, 14};

        int[] merged = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }

        int finalLength = 0;
        for (int i = 0; i < merged.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < finalLength; j++) {
                if (merged[i] == merged[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                merged[finalLength++] = merged[i];
            }
        }

        for (int i = 0; i < finalLength - 1; i++) {
            for (int j = i + 1; j < finalLength; j++) {
                if (merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        System.out.print("Final Array: ");
        for (int i = 0; i < finalLength; i++) {
            System.out.print(merged[i] + " ");
        }
        System.out.println("\nLength: " + finalLength);
    }
}
