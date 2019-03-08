package starwarsinterfacepractice;

public class Enemy implements Character {

    public String weapon = "red lightsaber";

    public Enemy() {

    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks you.");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals themself.");
    }

    public void weaponDraw() {
        System.out.println("The enemy drew their weapon.");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }
}
