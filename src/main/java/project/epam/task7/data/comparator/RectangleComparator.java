package project.epam.task7.data.comparator;

import project.epam.task7.model.Rectangle;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle rectangleOne, Rectangle rectangleTwo) {
        int idOne = rectangleOne.getId();
        int idTwo = rectangleTwo.getId();

        return idOne - idTwo;
    }
}
