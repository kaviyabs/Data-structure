package addon;

public class RotateLeft {
	    public static void rotateLeft(int[] arr, int d) {
	        int n = arr.length;
	        for (int i = 0; i < d; i++) {
	            int temp = arr[0]; 
	            for (int j = 0; j < n - 1; j++) {
	                arr[j] = arr[j + 1];
	            }
	            arr[n - 1] = temp;
	        }
	    }
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int d = 2;
	        System.out.print("Original array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        rotateLeft(arr, d);

	        System.out.print("\nArray after " + d + " left rotations: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}

