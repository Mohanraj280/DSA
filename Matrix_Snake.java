import java.util.ArrayList;

public class Snake {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 4, 5, 6 }, { 46, 5, 6 } };
        ArrayList<Integer> lst = new ArrayList<>();
        int cols = arr[0].length;
        int rows = arr.length;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }
}
