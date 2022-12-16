import java.util.Scanner;

class SelectionSort {

    public static void main(String[] args) {

        int i, arraySize;
        Scanner sc = new Scanner(System.in);
        arraySize = sc.nextInt();
        int arr[] = new int[arraySize];
        for (i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();

        }

        // selection sort
        for (i = 0; i < arraySize; i++) {

            int minimumNum = i;
            for (int j = i + 1; j < arraySize; j++) {

                if (arr[j] < arr[i]) {
                    minimumNum = j;

                }
            }

            // swapping
            int temp = arr[minimumNum];
            arr[minimumNum] = arr[i];
            arr[i] = temp;
        }

        for (i = 0; i < arraySize; i++) {

            System.out.println(arr[i]);
        }

    }
}