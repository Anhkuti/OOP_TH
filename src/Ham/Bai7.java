package Ham;

public class Bai7 {
    public static void main(String[] args) {
//        if (isPrime(13)) {
//            System.out.println("đây là số nguyên tố");
//        } else {
//            System.out.println("đây kh phải số nguyên tố");
//        }

        // cách dunùng bằng toán tử 3 ngôi
        String result = isPrime(13) ? "đay là số nguyên tố" : "đây không phải là số nguyên tố";
        System.out.println(result);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
