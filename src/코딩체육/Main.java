package 코딩체육;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = n / 4;
        for (int i = 0; i < N; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
