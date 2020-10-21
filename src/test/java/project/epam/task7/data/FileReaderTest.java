package project.epam.task7.data;

import org.junit.Assert;
import org.junit.Test;
import project.epam.task7.exception.DataException;

import java.util.Arrays;
import java.util.List;

public class FileReaderTest {
    private static final String INPUT = "src/test/resources/data.txt";
    @Test

    public void fileReaderTestShouldReadDataFromFile() throws DataException {
        //given
        FileDataReader reader = new FileDataReader(INPUT);

        //when
        List<String> lines = reader.readFromFile();

        //then
        Assert.assertEquals(lines, Arrays.asList("2.0 3.0 1.0 1.0 1.0 3.0 4.0 3.0 4.0 1.0", "1.0 1.0 2.0 1.5 2.0 2.5 3.0 2.5 3.0 1.5"));
    }
}
