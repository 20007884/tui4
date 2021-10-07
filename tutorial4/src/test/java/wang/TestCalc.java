package wang;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestCalc extends TestCase {
    public void testAdd() {
        Calc calculator = new Calc();
        int result = calculator.add(4, 3);
        Assert.assertEquals(7, result);
    }
}