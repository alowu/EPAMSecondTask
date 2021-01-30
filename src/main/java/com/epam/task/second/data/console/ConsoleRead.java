package com.epam.task.second.data.console;

import org.apache.log4j.Logger;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleRead {

    private final static Logger LOGGER = Logger.getLogger(ConsoleRead.class);

    public String read(InputStream in) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(in);
        String current = scanner.nextLine();

        LOGGER.info("Got data from some input stream");

        result.append(current);
        return new String(result);
    }
}
