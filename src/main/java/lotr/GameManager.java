package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        String c1name = c1.getClass().getSimpleName();
        String c2name = c2.getClass().getSimpleName();
        System.out.println(c1name + " and " + c2name + " are fighting!");
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(c1name + " kicks " + c2name + "!");
            if (!c2.isAlive()) {
                System.out.println(c2name + " is defeated! " + c1name + " wins.");
                break;
            }
            c2.kick(c1);
            System.out.println(c2name + " kicks " + c1name + "!");
            if (!c1.isAlive()) {
                System.out.println(c1name + " is defeated! " + c2name + " wins.");
            }
        }
    }
}
