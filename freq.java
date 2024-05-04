import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class frequency {
    public static void main(String[] args) {
        int arr[] = { 1, 22, 2, 2, 2, 2, 2, 2, 3, 4, 5, 5 };
        ArrayList<Integer> lst = new ArrayList<>();
        for (Integer integer : arr) {
            lst.add(integer);
        }
        Set<Integer> st = new HashSet<>();
        for (int i : arr) {
            st.add(i);
        }
        System.out.println(st);

        // Frequency Count using Collections.frequency method
        for (Integer integer : st) {
            int freq = Collections.frequency(lst, integer);
            System.out.println(integer + " occurred " + freq);
        }
        System.out.println(lst);

        // Frequency Count using HashMap
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        System.out.println(freq);

    }
}
