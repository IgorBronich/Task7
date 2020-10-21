package project.epam.task7;

/*
Четырехугольник. Разработать классы Точка и Четырехугольник. Создать методы и тесты:
вычисления площади и периметра фигуры; составляют ли точки четырехугольник(не лежат ли три точки на одной прямой);
является ли четырехугольник выпуклым; является ли четырехугольник квадратом.
 */

import project.epam.task7.data.*;
import project.epam.task7.exception.DataException;
import project.epam.task7.logic.Calculator;
import project.epam.task7.model.Rectangle;

import java.util.List;

public class Main {
    private final static String INPUT = "data.txt";

    public static void main(String[] args) throws DataException {

        Director director = new Director(new FileDataReader(INPUT), new LineValidator(), new RectangleCreator(new RectangleParser()));
        List<Rectangle> rectangles = director.create();
        Rectangle rectangleOne = rectangles.get(0);
        System.out.println(rectangles);

        Calculator calculator = new Calculator();

        double area = calculator.calculateArea(rectangleOne);
        System.out.println("Area is: " + area);
        double perimeter = calculator.calculatePerimeter(rectangleOne);
        System.out.println("Perimeter is: " + perimeter);

        calculator.calculateSquare(rectangleOne);


    }
}
