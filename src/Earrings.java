public class Earrings extends RPGAccessories implements Earring{

    public Earrings(String name) {
        super(name);
    }


    @Override
    public void increaseHealth() {
        System.out.println(getName() + " increases health when equipped!");
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        increaseHealth();
        character.setHp(character.getHp() + (getLevelItem()*5));
    }

}