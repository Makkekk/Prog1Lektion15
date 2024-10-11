package opgave01.Weapon;

import java.util.ArrayList;

public class Weapon {

    private String name;

    public Weapon(String name) {
        this.name = name;

    }
    @Override
    public String toString() {
        return name + " (Name: " + name;
    }
}

