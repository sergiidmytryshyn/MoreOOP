package lotr;
public class GameManager {
    static void fight(Character c1, Character c2) {
        // to provide fight between to characters and explain via command 
        // line what happens during fight, till both of 
        // the characters are alive 
        while (c1.isAlive() && c2.isAlive()) {
            String name1 = c1.getClass().getSimpleName();
            String name2 = c2.getClass().getSimpleName();

            System.out.println(name1 + " VS " + name2);
            
            c1.kick(c2);
            System.out.println(name1 + " kicked " + name2 + " with power " + c1.getPower());
            System.out.println(name2 + " has " + c2.getHp() + " Hp");
            
            if (!c2.isAlive()){
                System.out.println("Yraaaaa peremoga, " + name1 + " WON!!!!!!");
                break;
            }
            
            c2.kick(c1);
            System.out.println(name2 + " kicked " + name1 + " with power " + c2.getPower());
            System.out.println(name1 + " has " + c1.getHp() + " Hp");
            
            if (!c1.isAlive()){
                System.out.println("Yraaaaa peremoga, " + name2 + " WON!!!!!!");
                break;
            }
            
            if (name1.equals("Hobbit") && name2.equals("Hobbit")){
                System.out.println("Two dummy dwarfs are yelling on each other for ages");
                break;
            }
            
            if (name1.equals("Elf") && name2.equals("Elf")){
                System.out.println("Two elfs can't kill each other, so we dont care bout such boring stuff");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Character hero1 = CharacterFactory.createCharacter();
        Character hero2 = CharacterFactory.createCharacter();
        fight(hero1, hero2);
    }
}
