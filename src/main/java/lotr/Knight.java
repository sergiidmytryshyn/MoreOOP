package lotr;
import java.util.Random;

public class Knight extends Character{
    private static Random random = new Random();
    public Knight(){
        super(random.nextInt(11)+2, random.nextInt(11)+2);
    }

    @Override
    public void kick(Character c) { 
        c.setHp(c.getHp() - this.getPower()); 
    }

    @Override
    public String toString(){
        return super.toString("Knight");
    }
    
}
