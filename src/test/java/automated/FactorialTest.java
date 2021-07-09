package automated;

import huawei.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialTest() {
        Assert.assertEquals(24,new Factorial().factorial(5));
    }
}
