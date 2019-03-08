
package starwarsinterfacepractice;


public interface Character {
    // These properties must be public, and they cannot be changed
    public String base = "character";    
    public void attack();
    public void heal();
    
    public String getWeapon();
    
}
