package Rewards.Platinum;

import Abstraction.IGameItem;
import Abstraction.ItemGenerator;

public class PlatinumGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new PlatinumRewards();
    }
}