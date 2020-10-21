package project.epam.task7.model;

import project.epam.task7.logic.Calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class RectangleObserver implements  Observer<RectangleObservable> {
    private final Map<Integer, Parameters> map = new HashMap<Integer, Parameters>();
    private Calculator calculator;
    private static final RectangleObserver INSTANCE = new RectangleObserver();

    private RectangleObserver(){
    }

    public static RectangleObserver getInstance(){
        return INSTANCE;
    }

    public Optional<Double> getArea(int id){
        if(!map.containsKey(id)){
            return Optional.empty();
        }
        Parameters parameters = map.get(id);
        double area = parameters.getArea();
        return Optional.of(area);
    }

    public Optional<Double> getPerimeter(int id){
        if(!map.containsKey(id)) {
            return Optional.empty();
        }
        Parameters parameters = map.get(id);
        double perimeter = parameters.getPerimeter();
        return Optional.of(perimeter);
}
    @Override
    public void update(RectangleObservable observable) {
        double area = calculator.calculateArea(observable);
        double perimeter = calculator.calculatePerimeter(observable);

        Parameters parameters = new Parameters(area, perimeter);
        Integer id = observable.getId();
        map.put(id, parameters);
    }
}
//    @Override
////    public void notify(RectangleObservable rectangle) {
////        double area = calculator.calculateArea(rectangle);
////        double perimeter = calculator.calculatePerimeter(rectangle);
////        Parameters parameters = new Parameters(area, perimeter);
////
////        map.put(rectangle.getId(), parameters);
////
////    }