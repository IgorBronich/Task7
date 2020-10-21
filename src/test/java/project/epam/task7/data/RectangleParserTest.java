package project.epam.task7.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RectangleParserTest {

    @Test
    public void rectangleParserTestShouldParseLine(){
        //given
        RectangleParser parser = new RectangleParser();
        String line = "1.0 2.0 3.0";

        //when
        List<Double> result = parser.parse(line);

        //then
        Assert.assertEquals(result, Arrays.asList(1.0, 2.0, 3.0));

    }
}
