package com.byulstudy.view.output;

import static com.byulstudy.view.output.OutputEnum.END_MESSAGE;
import static com.byulstudy.view.output.OutputEnum.START_MESSAGE;

public class Output {
    public void printStart() {
        System.out.print(START_MESSAGE.text());
    }

    public void printEnd() {
        System.out.println(END_MESSAGE.text());
    }

    public void printStory(String name) {
        System.out.println(name + "의 여정이 시작되었습니다.");
    }
}
