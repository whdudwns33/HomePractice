package 오븐시계;

import java.time.LocalDate;
import java.util.Scanner;

// 현재 시간 출력
// 걸린 시간 더하기
// 시간은 분단위로 주어짐
// 24시가 되면 00시로 초기화
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재시간 입력");
        int H = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(H + " " + M );

        System.out.println("조리시간(분) :");
        int time = sc.nextInt();
        int h = time / 60;
        int m = time % 60;

        System.out.println((H + h) % 24 + " " + (M + m));   // 24시가 되면 0시로 초기화
    }
}
