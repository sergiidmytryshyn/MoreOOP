package lotr;
import java.util.Random;

public class King extends Character{
    private static Random random = new Random();
    public King(){
        super(random.nextInt(11)+5, random.nextInt(11)+5);
    }

    @Override
    public void kick(Character c) { 
        c.setHp(c.getHp() - this.getPower()); 
    }
    @Override
    public String toString(){
        return super.toString("King");
    }
    
}
