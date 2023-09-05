package 윤년출력;
// 4의 배수 이면서 100의 배수가 아니고 
// 4의 배수 이면서 400의 배수이면 윤년
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("1 :" + "윤년입니다.");
        } else if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("1 :" + "윤년입니다.");
        } else {
            System.out.println("0 : 윤년이 아닙니다.");
        }
    }
}
