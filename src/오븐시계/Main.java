package 오븐시계;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int total = h*60 + m + t;

        int H = (total / 60) % 24;
        int M = total % 60;
        System.out.println(H + " " + M);
    }
}
