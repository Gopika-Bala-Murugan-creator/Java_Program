import java.util.*;

public class sparseArray {
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
	
	System.out.println("Row	Column	value");
	int count=0;
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			if(arr[i][j] > 0){
				System.out.println(i+"	"+j+"	"+arr[i][j]);
				count++;
			}
		}
	}

	System.out.println("Total number of memory allocated: "+(count*3)*4);
        

        sc.close();
    }
}