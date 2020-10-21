package project.epam.task7.data;

import org.junit.Assert;
import org.junit.Test;
import project.epam.task7.model.Point;
import project.epam.task7.model.Rectangle;

public class RectangleCreatorTest {

    @Test

    public void rectangleCreatorTestShouldCreateRectangle(){
        //given
        RectangleCreator creator = new RectangleCreator(new RectangleParser());
        String line = "1.0 1.0 1.0 3.0 4.0 3.0 4.0 1.0";

        //when
        Rectangle result = creator.create(line);

        //then
        Point pointOne = new Point(1.0, 1.0);
        Point pointTwo = new Point(1.0, 3.0);
        Point pointThree = new Point(4.0, 3.0);
        Point pointFour = new Point(4.0, 1.0);

        Rectangle actualRectangle = new Rectangle(pointOne, pointTwo, pointThree, pointFour);

        Assert.assertEquals(result, actualRectangle);
    }
}
