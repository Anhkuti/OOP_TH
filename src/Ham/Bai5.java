package Ham;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println(calculatePowerOfAnIntegers(2,5));
    }

    public static int calculatePowerOfAnIntegers(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }
}
