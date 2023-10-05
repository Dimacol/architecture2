package Core;

import Abstraction.ItemGenerator;
import Rewards.Emerald.EmeraldGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Platinum.PlatinumGenerator;
import Rewards.Ruby.RubyGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Core {

    public void run() {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new PlatinumGenerator());
        generatorList.add(new RubyGenerator());
        generatorList.add(new EmeraldGenerator());
        // generatorList.add(...)
        for (int i = 0; i < 10; i ++){
            int idx = Math.abs(random.nextInt() % 2) == 0 ? 0 : 1;
            ItemGenerator itemGenerator = generatorList.get(idx);
            itemGenerator.openReward();}

    }
}
