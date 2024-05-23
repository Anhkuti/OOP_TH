package Ham;

public class Bai11 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Kết quả tổng của mảng số nguyên là : " + sumOfAnArray0fIntegers(number));
    }

    public static int sumOfAnArray0fIntegers(int[] number) {
        int sum = 0;
        for (int i = 0; i <= number.length -1; i++) {
            sum += number[i];
        }
        return sum;
    }
}
