package NbyN정수입력;

import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 1; i <= num*num; i ++) {
            System.out.printf("%4d", i);
            if(i%num == 0) {
                System.out.println();
            }
        }
    }
}
