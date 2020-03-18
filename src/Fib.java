public class Fib {

    private int a = 0;
    private int b = 1;
    private int n = a + b;

    public int calcFib(int stoppingPoint) {
        while(n < stoppingPoint) {
            System.out.println(n);
            a = b;
            b = n;
            n = a + b;
            if (n > stoppingPoint) {
                n = b;
                break;
            }
        }
        return n;
    }
}
