public class Archer extends RPGCharacter implements RangedAtkCharacter {

    public Archer(String name, int bagSize){
        super(name, bagSize);
    }

    @Override
    public void rangedAtk(RPGCharacter target) {
        if(target == this){
            System.out.println("Can't attack yourself!");
            return;
        }

        target.takeDamage(getDmg()); // 2 times atk;
        System.out.println(getName()+"Ranged atk!");
    }

    public void rapidFire(RPGCharacter target) {
        if(target == this){
            System.out.println("Can't attack yourself!");
            return;
        }
        target.takeDamage(getDmg()+getDmg()); // 2 time atk
        System.out.println("Archer: "+getName()+"using rapidFire!");
    }
}
