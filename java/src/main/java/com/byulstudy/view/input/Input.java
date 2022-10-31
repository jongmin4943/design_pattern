package com.byulstudy.view.input;

public interface Input {
    String get();

    int getNumber();

    int getNumberInRange(int inclusive, int exclusive);
}
