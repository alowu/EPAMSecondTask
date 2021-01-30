package com.epam.task.second.data.console;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ConsoleReadTest {

    private final String CORRECT = "hello world text file to test classes";

    @Test
    public void testConsoleReaderShouldReadDataLineFromConsole() {
        ConsoleRead reader = new ConsoleRead();
        ByteArrayInputStream in = new ByteArrayInputStream(CORRECT.getBytes());

        String result = reader.read(in);

        Assert.assertEquals(result, CORRECT);
    }
}
