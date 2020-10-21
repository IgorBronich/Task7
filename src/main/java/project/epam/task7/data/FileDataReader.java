package project.epam.task7.data;

import org.apache.log4j.Logger;
import project.epam.task7.exception.DataException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataReader {

    private final static Logger LOGGER = Logger.getLogger(FileDataReader.class);
    private final String filename;


    public FileDataReader(String filename) {
        this.filename = filename;
    }

    public List<String> readFromFile() throws DataException {
        BufferedReader bufferedReader = null;
        List<String> data = new ArrayList<String>();

        try{
            bufferedReader = new BufferedReader(new FileReader(filename));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
               data.add(line);
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    LOGGER.error(e.getMessage());
                }
            }
        }
        return data;
    }
}
