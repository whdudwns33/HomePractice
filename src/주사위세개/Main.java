package 주사위세개;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int max = 0;

        int total;
            if (a == b && a == c) {
                total = 10000 + 1000*a;
            } else if (a != b && a!= c && b != c) {
                for (int i = 0; i < 3; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    total = max * 100;
                }

            }
                else
            {
                    // 3개의 변수가 모두 같은 경우
                    if (a == b && a == c) {
                        System.out.println(10000 + a * 1000);
                    } else {
                        // a가 b혹은 c랑만 같은 경우
                        if (a == b || a == c) {
                            System.out.println(1000 + a * 100);
                        }
                        // b가 c랑 같은 경우
                        else {
                            System.out.println(1000 + b * 100);
                        }
                    }
                }
        }

    }

