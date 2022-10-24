package com.byulstudy.view.output;

import com.byulstudy.model.battlePhase.PhaseType;
import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.battlefield.BattleStory;
import com.byulstudy.model.item.Item;

import static com.byulstudy.view.output.OutputEnum.END_MESSAGE;
import static com.byulstudy.view.output.OutputEnum.START_MESSAGE;

public class Output {
    private static Output output;

    private Output() {
    }

    public static Output getInstance() {
        if (output == null) {
            output = new Output();
        }
        return output;
    }

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
        builder.append("\n==========").append(battleResult.getCharacterName()).append("(이)가 ").append(battleResult.getMonsterName()).append("를 조우!").append("==========").append("\n");
        for (BattleStory battleStory : battleResult.getBattleStories()) {
            builder.append("-- ").append(battleStory.getAttacker()).append("의 공격").append(" --").append("\n");
            if (battleStory.getDamage() == 0) {
                builder.append("빗나감!!").append("\n");
            } else {
                builder.append(battleStory.getDamage()).append(" 의 데미지!").append("\n");
            }
            builder.append(battleStory.getDefender()).append("의 남은 체력 : ").append(battleStory.getDefenderRemainHp()).append("\n\n");
        }
        if (battleResult.isWinnerCharacter()) {
            builder.append(battleResult.getCharacterName()).append("(이)가 ").append(battleResult.getMonsterName()).append("를 처치!").append("\n");
            String gainedItem = battleResult.getGainedItem();
            String gainedExp = battleResult.getGainedExp();
            if (gainedItem != null) {
                builder.append("***").append(gainedItem).append("획득!!").append("***").append("\n");
            }
            if (gainedExp != null) {
                builder.append(gainedExp).append("경험치를 획득하셨습니다.").append("\n");
            }
            if (battleResult.isLevelUp()) {
                builder.append("**************").append("레벨업!!").append("**************").append("\n");
            }
            builder.append(battleResult.getCharacterLevel()).append("\n");
        } else {
            builder.append(battleResult.getCharacterName()).append("(이)가 ").append(battleResult.getMonsterName()).append("에게 패배 하였습니다!").append("\n");
        }

        System.out.println(builder);
    }

    public void printPhase(final PhaseType phaseType) {
        if (phaseType.isStandby()) {
            System.out.println("1. 모험\t 2. 치료\t 3. 무기교체\t 4. 게임종료");
        }
        if (phaseType.isStory()) {
            System.out.println("1. 검은 숲으로\t 2. 미궁의 던전으로\t 3. 정체불명\t 4. 뒤로");
        }
        if (phaseType.isBattle()) {
            System.out.println("1. 공격\t 2. 무기교체\t 3. 대화시도\t 4. 도망가기");
        }
    }

    public void printHeal(final String name, final int healAmount) {
        if (healAmount > 0) {
            System.out.println(name + "의 체력이 " + healAmount + " 회복되었습니다");
        } else {
            System.out.println("이미 최대 체력입니다.");
        }
    }

    public <E extends Item> void printItems(final Iterable<E> items) {
        StringBuilder builder = new StringBuilder();
        int cnt = 0;
        for (Item item : items) {
            builder.append(++cnt).append(". ").append(item.getName()).append("\t");
        }
        if (cnt == 0) {
            System.out.println("아이템이 없습니다.");
            return;
        }
        System.out.println(builder);
    }

    public void printEnter(final String fieldName) {
        System.out.println(fieldName + " 탐험을 시작합니다.");
    }

    public void printChangeItem(final Item selectedItem) {
        System.out.println(selectedItem.getName() + "을(를) 장착하셨습니다.");
    }

    public void printCharacterDie() {
        System.out.println("캐릭터가 사망하셨습니다.");
    }

    public void printPlayAgain() {
        System.out.println("게임을 다시 시작하시겠습니까? 1) 재시작\t 2) 종료");
    }

    public void printEnding(final String name) {
        System.out.println(name + "이 세상의 평화를 가져왔습니다.");
    }
}
