package project.epam.task7.exception;

import java.io.IOException;

public class DataException extends IOException {
    public DataException(String message) {
        super(message);
    }
}
