public abstract class RPGAccessories implements Accessories {

    private String name;
    private int durability;
    private int levelItem;

    public RPGAccessories(String name) {
        this.name = name;
        this.durability = 100;
        this.levelItem = 1;
    }

    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getLevelItem() {
        return levelItem;
    }

    public void upgrade() {
        this.levelItem++;

    }

    public void repair(){
        this.durability = 100;
    }

}


