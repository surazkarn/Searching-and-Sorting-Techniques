
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 2, 7, 4, 1, 5, 3 };
        int n = arr.length;

        // traversing over the array
        for (int i = 0; i < n - 1; i++) {

            // Last i elements are already in place so we do not include them.
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swapping, if the element at current index is greater
                    // than the next element.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
