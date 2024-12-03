//public abstract class RPGAccessories {
//    private String name;
//    private int durability;
//    private int levelItem;
//
//    public RPGAccessories(String name) {
//        this.name = name;
//        this.durability = 100;
//        this.levelItem = 1;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getDurability() {
//        return durability;
//    }
//
//    public void setDurability(int durability) {
//        this.durability = durability;
//    }
//
//    public int getLevelItem() {
//        return levelItem;
//    }
//
//    public void setLevelItem(int levelItem) {
//        this.levelItem = levelItem;
//    }
//
//    public abstract void use(RPGCharacter character);
//
//    public void repair() {
//        setDurability(100);  // Restore durability to 100
//    }
//
//    public void upgrade() {
//        this.levelItem++;
//    }
//}
//
//public class HermesBoots extends RPGAccessories implements Boots{
//
//    public HermesBoots(String name) {
//        super(name);
//    }
//
//    @Override
//    public void increaseSpeed(RPGCharacter character) {
//        int speedBonus = (int) (1.5*getLevelItem());  // Add a fixed speed boost
//        character.setSpeed(character.getSpeed() + speedBonus);
//    }
//
//    @Override
//    public void use(RPGCharacter character) {
//        if (getDurability() > 0) {
//            increaseSpeed(character);  // Increase speed when used
//            setDurability(getDurability() - 10);  // Reduce durability by 10
//            System.out.println(getName() + " used, durability remaining: " + getDurability());
//        } else {
//            System.out.println(getName() + " is broken! Please repair it.");
//        }
//    }
//}
//
//
//public class CrossEarring extends RPGAccessories implements Earring {
//    public CrossEarring(String name) {
//        super(name);
//    }
//
//    @Override
//    public void heal(RPGCharacter character) {
//        int healAmount = (int) (20 + (getLevelItem() * 1.5)); // Healing increases with the level of the earring
//        character.setHp(character.getHp() + healAmount);
//        System.out.println(character.getName() + " healed by " + healAmount + " using " + getName());
//    }
//
//    @Override
//    public void use(RPGCharacter character) {
//        if (getDurability() > 0) {
//            heal(character);  // Heal the character when used
//            setDurability(getDurability() - 5);  // Reduce durability by 5
//            System.out.println(getName() + " used, durability remaining: " + getDurability());
//        } else {
//            System.out.println(getName() + " is broken! Please repair it.");
//        }
//    }
//}