package project.epam.task7.data;

import org.apache.log4j.Logger;
import project.epam.task7.exception.DataException;
import project.epam.task7.model.Point;
import project.epam.task7.model.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Director {
    private final static Logger LOGGER = Logger.getLogger(Director.class);


    private FileDataReader reader;
    private LineValidator lineValidator;
    private RectangleCreator creator;


    public Director(FileDataReader reader, LineValidator lineValidator, RectangleCreator creator) {
        this.reader = reader;
        this.lineValidator = lineValidator;
        this.creator = creator;


    }

    public List<Rectangle> create() throws DataException {
        List<String> lines = reader.readFromFile();
        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        for (String line : lines) {
            if (lineValidator.validateLine(line)) {
                Rectangle rectangle = creator.create(line);
                rectangles.add(rectangle);
            }else{
                LOGGER.error("Line is not correct: " + line);
            }
        }
        return rectangles;
    }
}
