package com.epam.task.second.data.console;

import java.util.Scanner;

public class ConsoleRead {

    public String read() {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String current = scanner.nextLine();
        result.append(current);
        return new String(result);
    }
}
