package lotr;
public class Character {
    private int power;
    private int hp;

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c){};
    
    public boolean isAlive(){
        return this.hp>0;
    }
    
    public int getPower() {
        return power;
    }
    
    public void setPower(int power) {
        this.power = power;
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
        if (!this.isAlive()){
            this.hp = 0;
        }
    }

    public String toString(String name){
        return name+"{hp="+this.getHp()+", power="+this.getPower()+"}";
    }
    // ;"Elf{hp=10, power=10}"
}
