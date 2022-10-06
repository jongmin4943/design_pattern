package com.byulstudy.view.output;

import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.battlefield.BattleStory;

import static com.byulstudy.view.output.OutputEnum.END_MESSAGE;
import static com.byulstudy.view.output.OutputEnum.START_MESSAGE;

public class Output {
    public void printAskName() {
        System.out.print(START_MESSAGE.text());
    }
    public void printStart(String name) {
        System.out.println(name + "의 여정이 시작되었습니다.");
    }

    public void printEnd() {
        System.out.println(END_MESSAGE.text());
    }

    public void printStory(BattleResult battleResult) {
        StringBuilder builder = new StringBuilder();
        builder.append("==========").append(battleResult.getCharacterName()).append("(이)가 ").append(battleResult.getMonsterName()).append("를 조우!").append("==========").append("\n");
        for (BattleStory battleStory: battleResult.getBattleStories()) {
            builder.append("-- ").append(battleStory.getAttacker()).append("의 공격").append(" --").append("\n");
            if(battleStory.getDamage() == 0) {
                builder.append("빗나감!!").append("\n");
            } else {
                builder.append(battleStory.getDamage()).append(" 의 데미지!").append("\n");
            }
            builder.append(battleStory.getDefender()).append("의 남은 체력 : ").append(battleStory.getDefenderRemainHp()).append("\n");
        }
        if(battleResult.isWinnerCharacter()) {
            builder.append(battleResult.getCharacterName()).append("(이)가 ").append(battleResult.getMonsterName()).append("를 처치!").append("\n");
        } else {
            builder.append(battleResult.getCharacterName()).append("(이)가 ").append(battleResult.getMonsterName()).append("에게 패배 하였습니다!").append("\n");
        }
        System.out.println(builder);
    }
}
