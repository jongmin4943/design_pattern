package com.byulstudy.view.output;

public enum OutputEnum {
    START_MESSAGE("캐릭터 이름을 입력해주세요. : "),
    END_MESSAGE("게임 종료.");
    private final String text;

    OutputEnum(String text) {
        this.text = text;
    }

    public String text() {
        return this.text;
    }
}
