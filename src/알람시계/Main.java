package 알람시계;
// 다음날은 % 사용하면 다음날까지는 되지만, 다다음날은 안됨
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
        int h = (total - 45)/ 60;
        int m = (total - 45) % 60;

        if (h == 0) {
            h = 23;
        }
        if (m < 45) {
            m += 60;
        }
        if (h > 24) {
            h = ((total - 45)/ 60) % 24;
        }
        System.out.println(h + " : " + m);
    }
}
