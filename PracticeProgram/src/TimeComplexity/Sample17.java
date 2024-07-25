package TimeComplexity;

public class Sample17 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
