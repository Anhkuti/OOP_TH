package vonglap;

public class Bai5 {
    public static void main(String[] args) {
        //in ra các số từ 1 đến 100 trừ các số: 5,7,19,45,67
        for (int i = 1; i <= 100; i++) {
            if (i != 5 && i != 7 && i != 19
                    && i != 45 && i != 67) {
                System.out.print(i + "  ");
            }
        }
    }
}
