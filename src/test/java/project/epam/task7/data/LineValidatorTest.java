package project.epam.task7.data;

import org.junit.Assert;
import org.junit.Test;

public class LineValidatorTest {

    @Test
    public void testValidatorShouldCompareLineWithRegularExpressionAndReturnTrue() {
        //given
        LineValidator validator = new LineValidator();
        String line = "2.0 3.0 1.0 1.0 1.0 3.0 4.0 3.0 4.0 1.0";

        //when
        boolean result = validator.validateLine(line);

        //then
        Assert.assertTrue(result);
    }
    @Test
    public void testValidatorShouldCompareLineWithRegularExpressionAndReturnFalse() {
        //given
        LineValidator validator = new LineValidator();
        String line = "2.0 z3.0 1.0 1.0 1.0 3.0 4.0 3.0 4.0 1.0";

        //when
        boolean result = validator.validateLine(line);

        //then
        Assert.assertFalse(result);
    }

}
