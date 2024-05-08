package KT;

public class bai14_15_16 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("phần tử thứ nhất: " + numbers[0]);
        System.out.println("phần tử thứ tư: " + numbers[3]);
        for (int i = 0; i <= numbers.length -1; i++) {
            System.out.print(numbers[i] + "   ");
        }
    }
}
