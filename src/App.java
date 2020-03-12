public class App {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = a + b;
        for (int i = 0; i < n; i++) {
            System.out.println(n);
            a = b;
            b = n;
            n = a + b;
        }
    }
}
