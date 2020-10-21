package project.epam.task7.logic;

import org.junit.Assert;
import org.junit.Test;
import project.epam.task7.model.Point;
import project.epam.task7.model.Rectangle;

public class CalculatorTest {

    @Test
    public void calculatorTestShouldCalculateArea(){
        //given
        Calculator calculator = new Calculator();
        Point pointOne = new Point(1.0, 1.0);
        Point pointTwo = new Point(1.0, 3.0);
        Point pointThree = new Point(4.0, 3.0);
        Point pointFour = new Point(4.0, 1.0);

        Rectangle rectangle = new Rectangle(pointOne, pointTwo, pointThree, pointFour);

        //when
        double area = calculator.calculateArea(rectangle);

        //then
        Assert.assertEquals(area, 6.0, 0.01);
    }

    @Test
    public void calculatorTestShouldCalculatePerimeter(){
        //given
        Calculator calculator = new Calculator();
        Point pointOne = new Point(1.0, 1.0);
        Point pointTwo = new Point(1.0, 3.0);
        Point pointThree = new Point(4.0, 3.0);
        Point pointFour = new Point(4.0, 1.0);

        Rectangle rectangle = new Rectangle(pointOne, pointTwo, pointThree, pointFour);

        //when
        double perimeter= calculator.calculatePerimeter(rectangle);

        //then
        Assert.assertEquals(perimeter, 10.0, 0.01);
    }

    @Test
    public void calculatorTestShouldCalculateSquarer(){
        //given
        Calculator calculator = new Calculator();
        Point pointOne = new Point(1.0, 1.0);
        Point pointTwo = new Point(1.0, 3.0);
        Point pointThree = new Point(4.0, 3.0);
        Point pointFour = new Point(4.0, 1.0);

        Rectangle rectangle = new Rectangle(pointOne, pointTwo, pointThree, pointFour);

        //when
        boolean result = calculator.calculateSquare(rectangle);

        //then
        Assert.assertTrue(result);
    }



}
