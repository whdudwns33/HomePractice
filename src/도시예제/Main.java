package 도시예제;
// 도시 입력 받아 문자열로 출력 하기
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]서울 [2]수원 [3]경기 [4]인천");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("서울");
        } else if (choice == 2) {
            System.out.println("수원");
        } else if (choice == 3) {
            System.out.println("경기");
        } else if (choice == 4) {
            System.out.println("인천");
        } else {
            System.out.println("다시 입력하세요");
        }
    }
}
