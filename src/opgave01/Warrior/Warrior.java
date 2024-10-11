package opgave01.Warrior;

import opgave01.Weapon.Weapon;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level) {
        super(name, level);
        this.weapons = new ArrayList<>();

    }

    public void addWeapon(Weapon weapon) {

        weapons.add(weapon);
    }

    @Override
    public String toString() {
        return getName() + " (Level: " + getLevel() + ") Weapons: " + weapons;
    }
}