package 주사위세개;

public class Main {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 6 + 1);
        int random2 = (int) (Math.random() * 6 + 1);
        int random3 = (int) (Math.random() * 6 + 1);
        int total;
        System.out.println(random1 + " " + random2 + " " + random3);

        if (random1 == random2 && random2 == random3) { // 다 같은 경우
            total = 10000 + random3 * 1000;
            System.out.println(total);

        } else if (random1 == random2) {    // 1과 2가 같고 1과 3이 다름
            if (random1 != random3) {
                total = 1000 + random1 * 1000;
                System.out.println(total);
            }
        }else if (random1 == random3) {
            if (random1 != random2) {
                total = 1000 + random1 * 1000;
                System.out.println(total);
            }
        } else if (random2 == random3) {
            if (random1 != random2) {
                total = 1000 + random2 * 1000;
                System.out.println(total);
        }

    } else if (random1 != random2 && random2 != random3 && random1 != random3) {    // 다 다른 경우
            if (random1 > random2) {
                if (random1 > random3) {
                    total = random1 * 100;
                    System.out.println(total);
                } else if (random1 < random3) {
                    total = random3 * 100;
                    System.out.println(total);
                } else;
            } else if (random1 < random2) {
                if (random2 > random3) {
                    total = random2 * 100;
                    System.out.println(total);
                } else if (random2 < random3) {
                    total = random3 * 100;
                    System.out.println(total);
                } else;
            }
        }
    }
}
