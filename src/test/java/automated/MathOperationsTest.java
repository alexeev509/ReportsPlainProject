package automated;

import huawei.MathOperations;
import org.junit.Assert;
import org.junit.Test;

public class MathOperationsTest {
    @Test
    public void summTest() {
        MathOperations operations=new MathOperations();
        Assert.assertEquals(6,operations.summ(3,3));
    }

    @Test
    public void summOrNegative_1() {
        MathOperations operations=new MathOperations();
        Assert.assertEquals(47,operations.summOrNegative(44,3));
    }

    @Test
    public void summOrNegative_2() {
        MathOperations operations=new MathOperations();
        Assert.assertEquals(116,operations.summOrNegative(6,122));
    }
}
