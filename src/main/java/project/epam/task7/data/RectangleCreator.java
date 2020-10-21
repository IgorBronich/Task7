package project.epam.task7.data;


import org.apache.log4j.Logger;
import project.epam.task7.model.Point;
import project.epam.task7.model.Rectangle;


import java.util.Arrays;
import java.util.List;

public class RectangleCreator {
    private final static Logger LOGGER = Logger.getLogger(RectangleCreator.class);
    private RectangleParser rectangleParser;


    public RectangleCreator(RectangleParser rectangleParser) {
        this.rectangleParser = rectangleParser;

    }

    public Rectangle create(String line){
        Rectangle rectangle = null;
        List<Double> list = rectangleParser.parse(line);
        Point pointOne = new Point(list.get(0), list.get(1));
        Point pointTwo = new Point(list.get(2), list.get(3));
        Point pointThree = new Point(list.get(4), list.get(5));
        Point pointFour = new Point(list.get(6), list.get(7));
        IdGenerator idGenerator = new IdGenerator();

        List<Point> pointList = Arrays.asList(pointOne, pointTwo, pointThree, pointFour);
        if(validate(pointList)){
            rectangle = new Rectangle(pointOne, pointTwo, pointThree, pointFour);
        }else{
            LOGGER.error("Rectangle is not exist: " + line);
        }


        return rectangle;
    }

    private boolean validate(List<Point> list){

        Point pointOne = list.get(0);
        Point pointTwo = list.get(1);
        Point pointThree = list.get(2);
        Point pointFour = list.get(3);

        return pointOne.getX().equals(pointTwo.getX()) && pointTwo.getY().equals(pointThree.getY()) && pointThree.getX().equals(pointFour.getX()) && pointOne.getY().equals(pointFour.getY());

    }


}

