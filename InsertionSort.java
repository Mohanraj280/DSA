public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 9, 5, 6, 4 };
        System.out.println("Before Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println();
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
        }
        System.out.println("\n" + "After Sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
