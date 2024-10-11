package opgave01.Weapon;


import opgave01.models.Duration;

public class Spell {
    String name;
    int range;
    Duration duration;

    public Spell(String name, int range, Duration duration) {
        this.name = name;
        this.range = range;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " (Range: " + range + " ft, Duration: " + duration + ")";
    }
}

