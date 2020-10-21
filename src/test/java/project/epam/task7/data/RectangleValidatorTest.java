package project.epam.task7.data;

import org.junit.Assert;
import org.junit.Test;
import project.epam.task7.model.Point;
import project.epam.task7.model.Rectangle;

import java.util.Arrays;
import java.util.List;

public class RectangleValidatorTest {

    @Test
    public void rectangleValidatorTestShouldValidateAndReturnTrue(){

        //given
        RectangleValidator rectangleValidator = new RectangleValidator();
        List<Point> pointList = Arrays.asList(new Point(1, 1), new Point(1, 3),new Point(4, 3), new Point(4, 1));

        //when
        boolean result = rectangleValidator.validate(pointList);

        //then
        Assert.assertTrue(result);

    }
}
