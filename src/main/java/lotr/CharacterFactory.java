package lotr;
import java.util.Random;

public class CharacterFactory {
    static Character createCharacter() {
            Random random = new Random();
            int n = random.nextInt(4);
            Character heroes[] = {new King(), new Knight(), new Hobbit(), new Elf()};
            return heroes[n];
    }
}
