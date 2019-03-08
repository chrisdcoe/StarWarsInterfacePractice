package starwarsinterfacepractice;

public class Hero implements Character {

    public String weapon = "green lightsaber";

    public Hero() {

    }

    public void attack() {
        System.out.println("The hero attacks the enemy.");
    }

    public void heal() {
        System.out.println("The hero heals you.");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }
}
