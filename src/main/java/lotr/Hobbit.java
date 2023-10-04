package lotr;
public class Hobbit extends Character {
    public Hobbit(){
        super(0, 3);
    }    
    @Override
    public void kick(Character c) {
        toCry();
    }

    public void toCry(){
        System.out.println("Crying");
    }
    @Override
    public String toString(){
        return super.toString("Hobbit");
    }
}
