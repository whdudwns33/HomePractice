package 영수증문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("총 가격 :");
        int total = sc.nextInt();
        System.out.println("물건 갯수 :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i + "번째 물건 가격:");
            int a = sc.nextInt();
            System.out.println(i + "번째 물건의 갯수 :");
            int b = sc.nextInt();
            sum += a*b;
        }
        if (sum == total) {
            System.out.println("동일");
        } else {
            System.out.println("다름");
        }
    }
}
