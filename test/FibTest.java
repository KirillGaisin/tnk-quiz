import org.junit.Test;

import static org.junit.Assert.*;

public class FibTest {

    private Fib fib = new Fib();

    @Test
    public void calcFib() {
        int stoppingPoint = 100;
        int n = fib.calcFib(stoppingPoint);
        assertEquals(89, n);
    }
}