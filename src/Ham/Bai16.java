package Ham;

public class Bai16 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] saoChep = copyArray(numbers);

        for (int i : saoChep) {
            System.out.print(i + "  ");
        }
    }

    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
