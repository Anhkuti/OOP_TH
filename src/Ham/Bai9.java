package Ham;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println(reverseString("Ánh"));
    }
    public static String reverseString(String name) {
        String result = "";
        for (int i = name.length() -1; i >= 0; i--) {
            result += name.charAt(i);
        }
        return result;
    }
}
