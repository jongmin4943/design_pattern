package com.byulstudy.model.battlePhase;

import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.battlefield.Battlefield;
import com.byulstudy.model.battlefield.Dungeon;
import com.byulstudy.model.battlefield.Forest;
import com.byulstudy.model.character.Character;
import com.byulstudy.model.monster.RandomMonsterGenerator;
import com.byulstudy.utils.RandomUtils;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class StoryState extends State {
    public StoryState(final Input input, final Output output, final Character character, final Phase phase) {
        super(input, output, character, phase);
        processors.put(1, () -> output.printStory(startStory(new Forest(character))));
        processors.put(2, () -> output.printStory(startStory(new Dungeon(character))));
        processors.put(3, () -> output.printStory(startStory(RandomUtils.getBooleanByPercentage(50) ? new Forest(character) : new Dungeon(character))));
        processors.put(4, () -> this.changeState(PhaseType.STANDBY));
    }

    private BattleResult startStory(final Battlefield field) {
        output.printEnter(field.getFieldName());
        return field.fight(RandomMonsterGenerator.generate());
    }
}
