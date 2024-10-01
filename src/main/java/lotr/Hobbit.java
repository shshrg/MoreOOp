package lotr;

import lotr.kickstrategy.HobbitKick;

public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3);
    }

    public void kick(Character c) {
        HobbitKick kick = new HobbitKick();
        kick.kick(this, c);
    }

}
