package lotr;

import java.util.Random;

public class CharacterFactory {
    private static Character[] characters = {new Hobbit(), new Elf(), new King(), new Knight()};

    public static void main(String[] args) {
        System.out.println(createCharacter());
    }

    public static Character createCharacter() {
        Random random = new Random();
        return characters[random.nextInt(characters.length)];
    }
}
