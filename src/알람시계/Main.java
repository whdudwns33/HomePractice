package 알람시계;
// 전날 다음날 생각할 필요는 없는데 한번 해본거, 다시 해보자 좀 지저분해서
import java.util.Scanner;

// 알람 시계 45분 문제
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간 입력 :");
        int H = sc.nextInt();
        System.out.println("분 입력 :");
        int M = sc.nextInt();
        int total = H * 60 + M;
        int h = (total - 45) / 60;
        int m = (total - 45) % 60;
        System.out.println("알람이 울립니다.");
        if (h <= 0) {
            h = 23;
            m = M + 15;
            System.out.println("전날" + h + " : " + m);
        } else if (h > 24) {
            h = (total / 60) / 24;
            System.out.println("다음날" + h + " : " + m);
        } else if (m - 45 < 0) {
            h -= 1;
            m += 15;
            System.out.println(h + "  : " + m);
        }
    }
}
