package com.epam.task.second.data.file;

import com.epam.task.second.data.DataException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

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
            throw new DataException(e.getMessage(), e);
        }
        return new String(result);
    }
}
