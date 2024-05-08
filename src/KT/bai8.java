package KT;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a : ");
        int a = input.nextInt();
        System.out.println("nhập số b : ");
        int b = input.nextInt();
        if (a > 0 || b > 0) {
            System.out.println("Số a và b lớn hơn không?");
        }
    }
}
