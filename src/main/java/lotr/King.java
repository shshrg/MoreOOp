package lotr;
import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class King extends Character{
    public King() {
        super(new Random().nextInt(15-5)+5, new Random().nextInt(15-5)+5);
    }

    @Override
    public void kick(Character c) {
        NobleKick kick = new NobleKick();
        kick.kick(this, c);
    }
}
