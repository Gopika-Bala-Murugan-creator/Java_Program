import java.util.*;

public class transposeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Row of the 2D array: ");
        int r = sc.nextInt();

	System.out.print("Enter the Column of the 2D array: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < r; i++) {
        	for(int j=0; j<c; j++){
			arr[i][j] = sc.nextInt();
		}
	
        }
	
	int[][] transpose = new int[r][c];
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			transpose[j][i] = arr[i][j];
		}
	}

	System.out.println("Transpose Array: ");
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			System.out.print(transpose[i][j]+ " ");
		}
		System.out.println();
	}
        sc.close();
    }
}