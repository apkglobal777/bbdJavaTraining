package TimeComplexity;

public class Sample20 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = n / 2; i < n; i++) {
            for (int j = 0; j + n / 2 < n; j++) {
                for (int k = 1; k < n; k = k * 2) {
                    System.out.println("Nested time complexity");
                }
            }
        }
    }
}
