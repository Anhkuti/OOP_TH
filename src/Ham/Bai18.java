package Ham;

public class Bai18 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 10;
        int[] newArray = addElementToEndArray(numbers, value);
        for (int i : newArray) {
            System.out.print(i + "   ");
        }
    }

    public static int[] addElementToEndArray(int[] inputArray, int value) {
        int[] newArray = new int[inputArray.length + 1];
        System.arraycopy(inputArray, 0, newArray, 0, inputArray.length);
        newArray[newArray.length - 1] = value;
        return newArray;
    }
}
