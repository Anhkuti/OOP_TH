package Ham;

public class Bai8 {
    public static void main(String[] args) {
      int result = sumOneToN(5);
        System.out.println(result);
    }

    public static int sumOneToN(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
