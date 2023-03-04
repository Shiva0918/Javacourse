import org.testng.AssertJUnit;
import org.testng.annotations.Test;
public class testing {

    @Test
    void testMyMethod() {
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        AssertJUnit Assertions = null;
        Assertions.assertEquals(15, sum);

    }
}