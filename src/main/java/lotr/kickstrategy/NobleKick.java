package lotr.kickstrategy;
import java.util.Random;

import lotr.Character;

public class NobleKick  implements KickStrategy{
    @Override
    public void kick(Character whokicks, Character whoiskicked) {
        Random random = new Random();
        whoiskicked.setHp(whoiskicked.getHp() - random.nextInt(whokicks.getPower()));
    }
    
}
