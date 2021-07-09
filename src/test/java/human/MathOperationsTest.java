package human;

import huawei.MathOperations;
import org.junit.Assert;
import org.junit.Test;

public class MathOperationsTest {
    @Test
    public void summTest() {
        MathOperations operations=new MathOperations();
        Assert.assertEquals(10,operations.summ(5,5));
    }

    @Test
    public void summOrNegative_1() {
        MathOperations operations=new MathOperations();
        Assert.assertEquals(10,operations.summOrNegative(7,3));
    }

    @Test
    public void summOrNegative_2() {
        MathOperations operations=new MathOperations();
        Assert.assertEquals(4,operations.summOrNegative(3,7));
    }
}
