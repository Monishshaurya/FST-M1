
public class Activity4 {

	
	public static void insertionSort(int[] arr) {
        // Traverse through elements from index 1 to end
        for (int i = 1; i < arr.length; i++) {
            // Current element to be inserted into the sorted portion
            int key = arr[i];
            // Index to compare with the sorted portion
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insert the key into the correct position
            arr[j + 1] = key;
        }
    }

    // Method to print an array
    public static void printArray(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	
	
	public static void main(String[] args) 
	{
	
        int[] arr = {4,3,2,10,12,1,5,6};
        System.out.println("Original array before insertion:");
          printArray(arr);
          insertionSort(arr);

        System.out.println("After sorting Array");
        printArray(arr);
		
	}

}
