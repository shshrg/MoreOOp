package lotr.kickstrategy;

import lotr.Character;

public class ElfKick implements KickStrategy{
    @Override
    public void kick(Character whokicks, Character whoiskicked) {
        if (whokicks.getPower() > whoiskicked.getPower()) {
            whoiskicked.setHp(0);
        }
        else {
            whokicks.setPower(whokicks.getPower() - 1);
        }
    }
}
