package opgave01.Weapon;

import opgave01.Warrior.Warrior;

public class Ranged extends Weapon {
    private int range;

    public Ranged(String name,int range) {
        super(name);
        this.range = range;
    }

    public int getRange() {
        return range;
    }
}
