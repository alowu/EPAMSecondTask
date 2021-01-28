package com.epam.task.second.data.console;

import java.io.InputStream;
import java.util.Scanner;

public class ConsoleRead {

    public String read(InputStream in) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(in);
        String current = scanner.nextLine();
        result.append(current);
        return new String(result);
    }
}
