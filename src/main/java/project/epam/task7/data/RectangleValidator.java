package project.epam.task7.data;

import project.epam.task7.model.Point;


import java.util.List;

public class RectangleValidator {
    public boolean validate(List<Point> list){

        Point pointOne = list.get(0);
        Point pointTwo = list.get(1);
        Point pointThree = list.get(2);
        Point pointFour = list.get(3);

        return pointOne.getX().equals(pointTwo.getX()) && pointTwo.getY().equals(pointThree.getY()) && pointThree.getX().equals(pointFour.getX()) && pointOne.getY().equals(pointFour.getY());

    }
}
