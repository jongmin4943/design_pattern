package com.byulstudy.view.output;

import com.byulstudy.model.battlePhase.Step;
import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.battlefield.BattleStory;
import com.byulstudy.model.item.Item;

import java.util.List;

import static com.byulstudy.view.output.OutputEnum.END_MESSAGE;
import static com.byulstudy.view.output.OutputEnum.START_MESSAGE;

public class Output {
    public void printAskName() {
        System.out.print(START_MESSAGE.text());
    }
    public void printStart(final String name) {
        System.out.println(name + "의 여정이 시작되었습니다.");
    }

    public void printEnd() {
        System.out.println(END_MESSAGE.text());
    }

    public void printStory(final BattleResult battleResult) {
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

    public void printSelection(final Step step) {
        if(step.isStandby()) {
            System.out.println("1. 모험\t 2. 치료\t 3. 무기교체\t 4. 게임종료");
        }
        if(step.isStory()) {
            System.out.println("1. 검은 숲으로\t 2. 미궁의 던전으로\t 3. 정체불명\t 4. 뒤로");
        }
        if(step.isBattle()) {
            System.out.println("1. 공격\t 2. 무기교체\t 3. 대화시도\t 4. 도망가기");
        }
    }

    public void printHeal(final String name, final int healAmount) {
        System.out.println(name + "의 체력이 " + healAmount + " 회복되었습니다");
    }

    public <T extends Item> void printItems(final List<T> weapons) {
        if(weapons.size() == 0) {
            System.out.println("아이템이 없습니다.");
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < weapons.size(); i++) {
            builder.append(i+1).append(". ").append(weapons.get(i).getName()).append("\t");
        }
        System.out.println(builder);
    }

    public void printEnter(final String fieldName) {
        System.out.println(fieldName + " 탐험을 시작합니다.");
    }

    public void talkWithMonster() {
        System.out.println("대화를 시도합니다.");
        System.out.println("대화에 실패했습니다.");
    }

    public void printRunSuccess() {
        System.out.println("도망치는데 성공했습니다.");
    }

    public void printRunFail() {
        System.out.println("도망치는데 실패하셨습니다.");
    }
}
