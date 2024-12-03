
public class Lab05 {

    public static void main(String[] args) {

        Paladin paladin = new Paladin("Swordman", 5);
        Archer archer = new Archer("Ranger", 5);
        Earrings CrossEarring = new Earrings("CrossEarring");
        Boots HermesBoots = new Boots("HermesBoots");

        paladin.showStat();
        archer.showStat();

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");

        archer.equip(HermesBoots);
        paladin.equip(CrossEarring);
        paladin.showStat();
        archer.showStat();

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");

        paladin.addItemToBag(CrossEarring);
        archer.addItemToBag(HermesBoots);
        archer.equip(HermesBoots);
        paladin.equip(CrossEarring);
        paladin.showStat();
        archer.showStat();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");

        System.out.println("HermesBoots Durability: " + HermesBoots.getDurability());
        System.out.println("CrossEarring Durability: " + CrossEarring.getDurability());
        HermesBoots.repair();
        CrossEarring.repair();
        System.out.println("HermesBoots Durability After repair: " + HermesBoots.getDurability());
        System.out.println("CrossEarring Durability After repair: " + CrossEarring.getDurability());
        HermesBoots.upgrade();
        CrossEarring.upgrade();
        System.out.println("HermesBoots Level: "+HermesBoots.getLevelItem());
        System.out.println("CrossEarring Level: "+CrossEarring.getLevelItem());

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");

        archer.showInventory();
        paladin.showInventory();

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");

       paladin.levelUp();
       archer.levelUp();
       paladin.showStat();
       archer.showStat();

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(" ");

        paladin.meleeAtk(archer);
        paladin.criticalHit(archer);

        archer.rangedAtk(paladin);
        archer.rapidFire(paladin);

        paladin.showStat();
        archer.showStat();

        archer.rapidFire(archer);
        archer.rangedAtk(archer);
    }

}
//660612158 satakhun