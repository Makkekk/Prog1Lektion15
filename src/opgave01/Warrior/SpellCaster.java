package opgave01.Warrior;

import opgave01.Weapon.Spell;

import java.util.ArrayList;

public class SpellCaster extends Character {
    ArrayList<Spell> spells;


    public SpellCaster(String name, int level) {
        super(name, level);
        this.spells = new ArrayList<>();
    }

    public void addSpell(Spell spell) {
        spells.add(spell);
    }

    @Override
    public String toString() {
        return getName() + " (Level: " + getLevel() + ") Spells: " + spells;
    }

}


