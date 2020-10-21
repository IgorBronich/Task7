package project.epam.task7.data;

import java.util.ArrayList;
import java.util.List;

public class RectangleParser {
    private final static String SEPARATOR = "\\s+";

    public List<Double> parse(String line){
        List<Double>values = new ArrayList<Double>();
        for(String part: line.split(SEPARATOR)){
            values.add(Double.parseDouble(part));
        }
        return values;
    }
}
