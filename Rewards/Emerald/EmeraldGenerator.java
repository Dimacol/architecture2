package Rewards.Emerald;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class EmeraldGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new EmeraldRewards();
    }
}
