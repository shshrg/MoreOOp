package lotr;
import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class Knight extends Character{
    public Knight() {
        super(new Random().nextInt(12-2)+2, new Random().nextInt(12-2)+2);
    }

    @Override
    public void kick(Character c) {
        NobleKick kick = new NobleKick();
        kick.kick(this, c);
    }
}
