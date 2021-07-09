package human;

import huawei.IfThen;
import org.junit.Test;

public class IfThenTest {
    @Test
    public void ifElseTest_1() {
        IfThen ifThen= new IfThen();
        ifThen.twoBranches(0);
    }

    @Test
    public void ifElseTest_2() {
        IfThen ifThen= new IfThen();
        ifThen.twoBranches(10);
    }

}
