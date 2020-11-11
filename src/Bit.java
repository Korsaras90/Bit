import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = 0;
        for (int i = 0; i < n; i++) {
            String w = in.next();
            if (w.equals("++x")||w.equals("x++")) {
                r++;
            }
            if (w.equals("--x")||w.equals("x--")) {
                r--;
            }
        }
        System.out.println(r);
    }
}
