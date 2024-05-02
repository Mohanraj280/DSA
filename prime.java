import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class primenumber {
    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 18;
        ArrayList<Integer> lst = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        ArrayList<Integer> lst1 = new ArrayList<>(st);
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                lst.add(i);
            }
        }
        for (int i = 0; i < lst.size() - 1; i++) {
            for (int j = 0; j < lst.size() - 1; j++) {
                if (lst.get(i) + lst.get(j + 1) == n) {
                    // System.out.print(lst.get(i) + " v " + lst.get(j + 1) + "-> ");
                    st.add(lst.get(i));
                    st.add(lst.get(j + 1));
                }
            }
            for (int j = 0; j < lst1.size(); j++) {
                if ((lst1.get(i) + lst1.get(i + 1)) == n) {
                    System.out.print(lst1.get(i) + " v " + lst1.get(i + 1));
                }
            }

        }
        System.out.println(st);
        System.out.println(lst1);
        for (Integer val : st) {

            lst1.add(val);
        }
        System.out.println(lst1);

        // for (int i = 0; i < lst1.size() - 1; i++) {
        for (int j = 0; j < lst1.size() - 1; j++) {
            if (lst1.get(j) + lst1.get(j + 1) == n) {
                System.out.print(lst1.get(j) + " vs " + lst1.get(j + 1) + "-> ");
                // st.add(lst.get(i));
                // st.add(lst.get(j + 1));
            }
        }
        // }
    }
}
