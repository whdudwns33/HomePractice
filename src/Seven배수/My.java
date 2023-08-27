package Seven배수;

public class My {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++ ) {
            if (i%7 == 0 ) {
                System.out.printf("%6d", i);
                if(i%70 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
