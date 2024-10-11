package opgave01;

import opgave01.Warrior.Barbarian;
import opgave01.Warrior.Wizard;
import opgave01.Weapon.Ranged;
import opgave01.Weapon.Spell;
import opgave01.Weapon.Weapon;
import opgave01.models.Duration;

//Opgave B, Bevidst kompilerfejl fordi at weapon ikke kan arve fra Ranged klassen. da det er en subklasse.
public class Main {
    public static void main(String[] args) {

        Barbarian fofstelr = new Barbarian("Fofstelr", 1);
        Weapon longsword = new Weapon("Longsword");
        Weapon shortbow = new Ranged("ShortBow",80);

        fofstelr.addWeapon(longsword);
        fofstelr.addWeapon(shortbow);
        System.out.println(fofstelr);


        Wizard orlemaex = new Wizard("Orlemaex", 1);
        Spell fireball = new Spell("Fireball", 150, Duration.INSTANTANEOUS);
        orlemaex.addSpell(fireball);
        System.out.println(orlemaex);

    }
    //opgave c Kan ikke nedarve fra to

}


