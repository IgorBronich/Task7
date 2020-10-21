package project.epam.task7.model;

import java.util.HashSet;
import java.util.Set;

public class RectangleObservable extends Rectangle implements Observable<Rectangle>{

    private final Set<Observer<Rectangle>> observers = new HashSet<>();

    public RectangleObservable(Point pointOne, Point pointTwo, Point pointThree, Point pointFour) {
        super(pointOne, pointTwo, pointThree, pointFour);
    }

    @Override
    public void notifyObservers() {
        for (Observer<Rectangle> observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void setPointOne(Point pointOne) {
        super.setPointOne(pointOne);
        notifyObservers();
    }

    @Override
    public void setPointTwo(Point pointTwo) {
        super.setPointTwo(pointTwo);
        notifyObservers();
    }

    @Override
    public void setPointThree(Point pointThree) {
        super.setPointThree(pointThree);
        notifyObservers();
    }

    @Override
    public void setPointFour(Point pointFour) {
        super.setPointFour(pointFour);
        notifyObservers();
    }



}
