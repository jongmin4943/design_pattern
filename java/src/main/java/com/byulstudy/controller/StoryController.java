package com.byulstudy.controller;

import com.byulstudy.model.battlefield.BattleResult;
import com.byulstudy.model.battlefield.Battlefield;
import com.byulstudy.model.battlefield.Dungeon;
import com.byulstudy.model.battlefield.Forest;
import com.byulstudy.model.character.Character;
import com.byulstudy.model.monster.RandomMonsterGenerator;
import com.byulstudy.utils.RandomUtils;
import com.byulstudy.view.input.Input;
import com.byulstudy.view.output.Output;

public class StoryController extends Controller {
    public StoryController(final Input input, final Output output, final Character character, final FrontController controller) {
        super(input, output, character, controller);
        processors.put(1, () -> output.story(startStory(new Forest(character))));
        processors.put(2, () -> output.story(startStory(new Dungeon(character))));
        processors.put(3, () -> output.story(startStory(RandomUtils.getBooleanByPercentage(50) ? new Forest(character) : new Dungeon(character))));
        processors.put(4, () -> this.changeState(ControllerType.STANDBY));
    }

    private BattleResult startStory(final Battlefield field) {
        output.enterField(field.getFieldName());
        return field.fight(RandomMonsterGenerator.generate());
    }
}
