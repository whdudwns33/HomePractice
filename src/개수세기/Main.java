package 개수세기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++ ){
            if(arr.get(i) == b) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
