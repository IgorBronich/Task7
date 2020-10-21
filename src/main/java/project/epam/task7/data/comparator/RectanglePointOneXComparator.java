package project.epam.task7.data.comparator;

import project.epam.task7.model.Point;
import project.epam.task7.model.Rectangle;

import java.util.Comparator;

public class RectanglePointOneXComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rectangleOne, Rectangle rectangleTwo) {
        Point one = rectangleOne.getPointOne();
        Point two = rectangleTwo.getPointTwo();
        return one.getX().compareTo(two.getX());
    }
}
