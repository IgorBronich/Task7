package project.epam.task7.logic;

import org.apache.log4j.Logger;
import project.epam.task7.data.FileDataReader;
import project.epam.task7.model.Point;
import project.epam.task7.model.Rectangle;

public class Calculator {
    private final static Logger LOGGER = Logger.getLogger(Calculator.class);


    public double calculateArea(Rectangle rectangle){
        double firstSide = calculateFirstSideRectangle(rectangle);
        double secondSide = calculateSecondSideRectangle(rectangle);

        return firstSide * secondSide;
    }

    public double calculatePerimeter(Rectangle rectangle){
        double firstSide = calculateFirstSideRectangle(rectangle);
        double secondSide = calculateSecondSideRectangle(rectangle);

        return (firstSide + secondSide) * 2;
    }

    public boolean calculateSquare(Rectangle rectangle){
        double firstSide = calculateFirstSideRectangle(rectangle);
        double secondSide = calculateSecondSideRectangle(rectangle);
        boolean result = false;

        if(firstSide == secondSide){
            result = true;
            LOGGER.info("The rectangle is square");
        }else{
            LOGGER.info("The rectangle is not square");
        }
        return result;
    }

    private double calculateFirstSideRectangle(Rectangle rectangle) {
        Point pointOne = rectangle.getPointOne();
        Point pointTwo = rectangle.getPointTwo();

        return pointOne.getY() + pointTwo.getY();
    }

    private double calculateSecondSideRectangle(Rectangle rectangle) {
        Point pointOne = rectangle.getPointOne();
        Point pointFour = rectangle.getPointTwo();

        return pointOne.getX() + pointFour.getX();
    }


}
