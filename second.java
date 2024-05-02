import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        int secondlargest = Arrays.stream(arr).boxed().sorted((a, b) -> b - a).distinct().skip(1).findFirst()
                .orElse(-1);
        System.out.print(secondlargest);
    }
}
