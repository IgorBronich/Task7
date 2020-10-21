package project.epam.task7.data;


import org.junit.Test;
import org.mockito.Mockito;
import project.epam.task7.exception.DataException;
import project.epam.task7.model.Point;
import project.epam.task7.model.Rectangle;

import java.util.Arrays;
import java.util.List;


import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class DirectorTest {

    private static final String INPUT = "src/test/resources/data.txt";
    private static  final String LINE = "2.0 3.0 1.0 1.0 1.0 3.0 4.0 3.0 4.0 1.0";

    @Test
    public void directorTestShouldCreateRectangleList() throws DataException {

        //given
        FileDataReader reader = Mockito.mock(FileDataReader.class, INPUT);
        when(reader.readFromFile()).thenReturn(Arrays.asList(LINE));

        LineValidator validator = Mockito.mock(LineValidator.class);
        when(validator.validateLine(anyString())).thenReturn(true);


        Point pointOne = new Point(1.0, 1.0);
        Point pointTwo = new Point(1.0, 3.0);
        Point pointThree = new Point(4.0, 3.0);
        Point pointFour = new Point(4.0, 1.0);
        Rectangle actualRectangle = new Rectangle(pointOne, pointTwo, pointThree, pointFour);
        List<Point> pointList = Arrays.asList(pointOne, pointTwo, pointThree, pointFour);


        RectangleCreator creator = Mockito.mock(RectangleCreator.class);
        when(creator.create(LINE)).thenReturn(actualRectangle);



        Director director = new Director(reader, validator, creator);

        //when
        List<Rectangle> expectedList = director.create();

        //then
        verify(reader, times(1)).readFromFile();
        verify(validator, times(1)).validateLine(LINE);
        verify(creator, times(1)).create(LINE);




    }
}
