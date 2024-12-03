public abstract class RPGCharacter implements Character{
    private String name;
    private int level;
    private int dmg ;
    private int hp ;
    private int speed;
    private int mana ;
    private int defense;
    private RPGAccessories[] bag;
    private int itemCount;

    public RPGCharacter(String name, int bagSize){

        this.name = name;
        this.level = 1;
        this.dmg = 10;
        this.hp = 100;
        this.speed = 10;
        this.mana = 10;
        this.defense = 10;
        this.bag = new RPGAccessories[bagSize];

    }

    public int getLevel() {
        return level;
    }

    public int getDmg() {
        return dmg;
    }
    public int getHp() {
        return hp;
    }
    public int getSpeed() {
        return speed;
    }
    public int getMana() {
        return mana;
    }

    public String getName() {
        return name;
    }
    public int getDefense() {
        return defense;
    }

    public void showStat() {
        System.out.println(getName()+" "+"Level: " + level + ", Damage: " + dmg +" Defense: "+ defense + ", HP: " + hp + ", Speed: " + speed + ", Mana: " + mana);
    }

    public void levelUp(){
        level++;
        hp += 10;
        dmg += 5;
        speed += 5;
        mana += 5;
        defense += 5;
        System.out.println(name + "level up!");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void showInventory() {
        System.out.println(name + "'s Inventory:");
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] != null) {
                System.out.println(" " + bag[i].getName());
            } else {
                System.out.println("Empty Slot");
            }
        }
    }

    @Override
    public void equip(RPGAccessories item) {
        if (bag == null || bag.length == 0) {
            System.out.println("Bag is empty!");
            return;
        }
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] != null && bag[i].equals(item)) {
                System.out.println(item.getName() + " equipped!");
                item.applyEffect(this);
                item.setDurability(item.getDurability()-5);
                return;
            }
        }

        System.out.println(item.getName() + " is not in the bag!");
    }

    public void addItemToBag(RPGAccessories item) {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i] == null) {
                bag[i] = item;
                System.out.println(item.getName() + " has been added to " + getName() + "'s bag.");
                itemCount++;
                return;
            }
        }
        System.out.println("No space available in the bag.");
    }

    public void takeDamage(int Dmg) {
        int gotDmg;

        if (Dmg > defense) {
            gotDmg = Dmg - defense;
        } else {
            gotDmg = Dmg / 2;
        }

        hp -= gotDmg;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " takes " + gotDmg + " damage! Remaining HP: " + hp);
        }
    }


}


