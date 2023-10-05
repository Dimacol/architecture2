package Rewards.Ruby;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class RubyGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new RubyRewards();
    }
}
