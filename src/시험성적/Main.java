package 시험성적;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        (score >= 90) ? System.out.println("A") : (score >= 80) ? System.out.println("B") : (score >= 70) ? System.out.println("C") : (score >= 60) ? System.out.println("D") : (score >= 50) ? System.out.println("F") : System.out.println("다시 입력하시오");
    }
}
