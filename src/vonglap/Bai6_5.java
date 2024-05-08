package vonglap;

public class Bai6_5 {
    public static void main(String[] args) {
        //chuyển sang vòng lặp while bài 5
        int i = 1;
        while (i <= 100) {
            if (i != 5 && i != 7 && i != 19
                    && i != 45 && i != 67) {
                System.out.print(i + "  ");
            }
            i++;
        }
    }
}
