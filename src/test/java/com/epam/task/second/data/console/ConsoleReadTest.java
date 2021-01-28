package com.epam.task.second.data.console;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ConsoleReadTest {

    private final String CORRECT = "hello world text file to test classes";

    @Test
    public void test() {
        ConsoleRead reader = new ConsoleRead();
        ByteArrayInputStream in = new ByteArrayInputStream(CORRECT.getBytes());

        String result = reader.read(in);

        Assert.assertEquals(result, CORRECT);
    }
}
