public class Sortings {
    /*Bubble Sort(Always in Ascending order) */
    // public static void printArray(int[] arr){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args) {
        
    //   int[] arr = {2,6,7,3,9,1};
      
    //   for(int i=0; i<arr.length-1; i++){
    //       for(int j=0; j<arr.length-i-1; j++){
    //           if(arr[j]>arr[j+1]){
    //               int temp = arr[j];
    //               arr[j]=arr[j+1];
    //               arr[j+1]=temp;
    //           }
    //       }
    //   }
    //    printArray(arr);
    // }

/*Quick sort */

    // public static int partition(int arr[], int low, int high){
    //     int pivot = arr[high];
    //     int i = low - 1;
        
    //     for (int j = low; j < high; j++) {  // Fix the loop to go from low to high - 1
    //         if (arr[j] < pivot) {
    //             i++;
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
        
    //     // Swap pivot to the correct position
    //     i++;
    //     int temp = arr[i];
    //     arr[i] = arr[high];
    //     arr[high] = temp;
        
    //     return i;
    // }

    // public static void quickSort(int[] arr, int low, int high) {
    //     if (low < high) {
    //         int pidx = partition(arr, low, high);  // Find the pivot index
    //         quickSort(arr, low, pidx - 1);  // Sort the left subarray
    //         quickSort(arr, pidx + 1, high); // Sort the right subarray
    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[] = { 4, 6, 2, 8, 3 };
    //     int n = arr.length;
    //     quickSort(arr, 0, n - 1);
        
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }


    
}
