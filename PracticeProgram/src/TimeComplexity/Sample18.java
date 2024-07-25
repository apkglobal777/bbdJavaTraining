package TimeComplexity;

import java.util.Scanner;

public class Sample18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.println("Find my TC");
                    break;
                }
            }
        }
    }
}
