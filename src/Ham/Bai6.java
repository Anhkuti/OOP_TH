package Ham;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println(calculateFactorialOfAnInteger(4));
    }

    public static int calculateFactorialOfAnInteger(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
