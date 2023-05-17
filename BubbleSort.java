import java.util.Arrays;
public class BubbleSort {
	
	public static void printArray(int arr[]) {
		
		System.out.println("Bubble Sort : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {7,8,3,1,2,0};
		
		// Bubble Sort
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					// Swap the element
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);

	}

}
