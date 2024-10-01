package lotr;
import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class Knight extends Character{
    private static final Random random = new Random();
    private static final int hp = random.nextInt(2,12);
    private static final int power = random.nextInt(2,12);


    public Knight() {
        super(power, hp);
    }

    @Override
    public void kick(Character c) {
        NobleKick kick = new NobleKick();
        kick.kick(this, c);
    }
}
