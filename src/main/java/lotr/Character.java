package lotr;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Character {
   private int power;
   private int hp;

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
