package array;

public class test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int tich = 1;
        for (int i = 0; i <= numbers.length - 1; i++) {
            sum += numbers[i];
            tich *= numbers[i];
        }
        System.out.println(sum);
        System.out.println(tich);
    }
}
