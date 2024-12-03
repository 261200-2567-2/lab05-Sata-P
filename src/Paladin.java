public class Paladin extends RPGCharacter implements MeleeCharacter{

    public Paladin(String name, int bagSize){
        super(name, bagSize); //using constructor from supertype
    }

    public void criticalHit(RPGCharacter target) {
        if(target == this){
            System.out.println("Can't attack yourself!");
            return;
        }
        int crit = (int) (getDmg()+getDmg()+(0.5*getLevel()));
        target.takeDamage(crit);
        System.out.println("Paladin: "+getName()+"using criticalHit!");
    }


    @Override
    public void meleeAtk(RPGCharacter target) {
        if(target == this){
            System.out.println("Can't attack yourself!");
            return;
        }
        target.takeDamage(getDmg());
        System.out.println(getName()+"Melee atk!");
    }
}
