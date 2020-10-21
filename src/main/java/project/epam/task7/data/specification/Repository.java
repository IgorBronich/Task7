package project.epam.task7.data.specification;

import project.epam.task7.exception.DataException;
import project.epam.task7.model.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final List<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) throws DataException {
        if(rectangles.contains(rectangle)){
            throw new DataException("Repository contains rectangle");
        }else {
            rectangles.add(rectangle);
        }
    }

    public void update(Rectangle rectangle) throws DataException{
        int id = rectangle.getId();
        Rectangle thisRectangle;

        for (int i = 0; i < rectangles.size(); i++){
            thisRectangle = rectangles.get(i);
            if(thisRectangle.getId() == id){
                rectangles.remove(thisRectangle);
                rectangles.add(rectangle);
            }
        }
    }

    public List<Rectangle> query(Specification<Rectangle> specification){
        List<Rectangle>result = new ArrayList<>();
        for(Rectangle rectangle: rectangles){
            if(specification.specified(rectangle)){
               result.add(rectangle);
            }
        }
        return result;
    }
}
