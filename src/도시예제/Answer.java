package 도시예제;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = {"", "[1]서울", "[2]수원", "[3]경기", "[4]인천"};
        System.out.println("[1]서울 [2]수원 [3]경기 [4]인천");
        int num = sc.nextInt();
        String city = arr[num];
        System.out.println(city);

        }
    }
