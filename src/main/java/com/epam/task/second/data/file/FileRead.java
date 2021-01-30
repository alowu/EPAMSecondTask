package com.epam.task.second.data.file;

import com.epam.task.second.data.DataException;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    private final static Logger LOGGER = Logger.getLogger(FileRead.class);

    public String read(String fileName) throws DataException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
            String buffer = reader.readLine();
            while (buffer != null) {
                result.append(buffer);
                buffer = reader.readLine();
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
            throw new DataException(e.getMessage(), e);
        }

        LOGGER.info("Got data from file");

        return new String(result);
    }
}
