package com.epam.task.second.data.file;

import com.epam.task.second.data.DataException;
import org.junit.Assert;
import org.junit.Test;

public class FileReadTest {

    private final String TEST_PATH = "src/test/java/input.txt";
    private final String CORRECT = "hello world text file to test classes";

    @Test
    public void testFileReadShouldReadTextFromFile() throws DataException {
        FileRead reader = new FileRead();

        String result = reader.read(TEST_PATH);

        Assert.assertEquals(result, CORRECT);
    }
}
