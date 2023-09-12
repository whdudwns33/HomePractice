package 아스킷코드;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            int n = sc.nextInt();
            System.out.println((char)n);
        } else if (i == 1) {
            char ch = sc.next().charAt(0);
            System.out.println((int)ch);
        } else;
    }
}
