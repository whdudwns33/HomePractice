package 조건문더하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("개수를 입력하시오 :");
        int n = sc.nextInt();

        Integer [] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("정수 두개를 입력하시오. :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        for(Integer e : arr) {
            System.out.print(e + " ");
        }
    }
}
