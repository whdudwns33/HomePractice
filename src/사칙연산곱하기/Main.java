package 사칙연산곱하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int rst1 = num1 * (num2%10);
        int rst2 = num1 * ((num2%100)/10);
        int rst3 = num1 * (num2/100);
        int rst4 = rst1 + rst2*10 + rst3*100;
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
        System.out.println(rst4);
    }
}
