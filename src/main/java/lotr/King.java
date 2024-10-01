package lotr;
import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class King extends Character{
    private static final Random random = new Random();
    private static final int hp = random.nextInt(5,15);
    private static final int power = random.nextInt(5,15);


    public King() {
        super(power, hp);
    }

    @Override
    public void kick(Character c) {
        NobleKick kick = new NobleKick();
        kick.kick(this, c);
    }
}
