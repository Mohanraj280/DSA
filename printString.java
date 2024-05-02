public class printString {
    public static void main(String[] args) {
        String str = "heii3434";
        System.out.println(str.replaceAll("[^A-Za-z]+", ""));
        String str1 = "12345678hthe9";
        System.out.println(str1.replaceAll("[^0-9]+", ""));
    }
}
