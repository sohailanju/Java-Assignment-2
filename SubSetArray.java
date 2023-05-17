import java.util.Arrays;
class SubSetArray {
	// Return true if arr2[] is a subset of arr1[] 
	static boolean isSubset(int arr1[], int arr2[], int m,
							int n)
	{
		int i = 0, j = 0;

		if (m < n)
			return false;

		//Arrays.sort(arr1); // sorts arr1 using sort function.
		//Sort the arr1 using bubble sort algorithm.
		for(int i1=0; i1<arr1.length-1; i1++) {
			for(int j1=0; j1<arr1.length-i1-1; j1++) {
				if(arr1[j1] > arr1[j1+1]) {
					// Swap the element
					int temp = arr1[j1];
					arr1[j1] = arr1[j1+1];
					arr1[j1+1] = temp;
				}
			}
		}
		//Arrays.sort(arr2); // sorts arr2 using 
		//Sort the arr2 using bubble sort algorithm. 
		for(int i1=0; i1<arr2.length-1; i1++) {
			for(int j1=0; j1<arr2.length-i1-1; j1++) {
				if(arr2[j1] > arr2[j1+1]) {
					// Swap the element
					int temp = arr2[j1];
					arr2[j1] = arr2[j1+1];
					arr2[j1+1] = temp;
				}
			}
		}

		while (i < n && j < m) {
			if (arr1[j] < arr2[i])
				j++;
			else if (arr1[j] == arr2[i]) {
				j++;
				i++;
			}
			else if (arr1[j] > arr2[i])
				return false;
		}

		if (i < n)
			return false;
		else
			return true;
	}

	public static void main(String[] args)
	{
		int arr1[] = { 10, 5, 7, 9, 11, 4, 2};
		int arr2[] = { 5, 10, 2, 4 };

		int m = arr1.length;
		int n = arr2.length;

		if (isSubset(arr1, arr2, m, n))
			System.out.println("arr2[] is subset of another arr1[] ");
		else
			System.out.println(
				"arr2[] is not a subset of arr1[] ");
	}
}

