public class BinarySearch {

    static int binarySearch(int[] arr, int left, int right, int target) {

        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, right, target);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 3 };
        int left = 0, right = arr.length - 1;
        int target = 91;
        int ans = binarySearch(arr, left, right, target);
        System.out.println(ans);
    }
}
