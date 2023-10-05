package Rewards.Platinum;

import Abstraction.IGameItem;

public class PlatinumRewards  implements IGameItem {

    @Override
    public String open() {
        return "Platinum";
    }
}
