public class Boots extends RPGAccessories implements Boot{

    public Boots(String name) {
        super(name);
    }

    @Override
    public void increaseSpeed() {
        System.out.println(getName() + " increases speed when equipped!");
    }

    @Override
    public void applyEffect(RPGCharacter character) {
        increaseSpeed();
        character.setSpeed(character.getSpeed() + (getLevelItem()*5));
    }


}
