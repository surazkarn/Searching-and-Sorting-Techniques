
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 2, 7, 4, 1, 5, 3 };
        int n = arr.length;

        // bubble sort
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

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
