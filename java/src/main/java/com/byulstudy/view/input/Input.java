package com.byulstudy.view.input;

import java.util.Scanner;

public class Input {
    private static final String NUMBER_REGEX = "[0-9]+";
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public int getNumberInput() {
        String input = scanner.nextLine();
        checkInputIsNumber(input);
        return Integer.parseInt(input);
    }
    public int getNumberInputInRange(final int inclusive, final int exclusive) {
        int input = getNumberInput();
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
