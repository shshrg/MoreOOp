package lotr;

public abstract class Character {
   private int power;
   private int hp;

   public Character(int power1, int hp1) {
      power = power1;
      hp = hp1;
   }

   public boolean isAlive() {
      return hp > 0;
   }
   public void setHp(int hp) {
    this.hp = hp < 0 ? 0: hp;
   }
   public int getHp() {
      return hp;
   }
   public void setPower(int power) {
      this.power = power < 0 ? 0 : power;
   }
   public int getPower() {
      return power;
   }
   public abstract void kick(Character c);

   @Override
   public String toString() {
    return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
   }   
}
