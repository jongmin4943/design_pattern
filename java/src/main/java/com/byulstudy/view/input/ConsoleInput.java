package com.byulstudy.view.input;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private static final String NUMBER_REGEX = "[0-9]+";
    private final Scanner scanner;
    private static ConsoleInput input;

    private ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    public static ConsoleInput getInstance() {
        if(input == null) {
            input = new ConsoleInput();
        }
        return input;
    }

    @Override
    public String get() {
        return scanner.nextLine();
    }

    @Override
    public int getNumber() {
        String input = scanner.nextLine();
        checkInputIsNumber(input);
        return Integer.parseInt(input);
    }
    @Override
    public int getNumberInRange(final int inclusive, final int exclusive) {
        int input = getNumber();
        if(input < inclusive || input >= exclusive) {
            throw new NumberFormatException();
        }
        return input;
    }

    private void checkInputIsNumber(final String input) {
        if(!input.matches(NUMBER_REGEX)){
            throw new NumberFormatException();
        }
    }
}
