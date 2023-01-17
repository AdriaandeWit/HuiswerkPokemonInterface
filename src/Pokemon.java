import java.util.List;

public abstract class Pokemon {
    private final String name;
    private final int level ;
    private final String type;
    private final String food;
    private final String sounds;
    private int hp;


    public Pokemon(String name, int level, int hp, String food, String sounds , String type) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.food = food;
        this.sounds = sounds;
        this.hp = hp;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSounds() {
        return sounds;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract List<String>getAttacks();

}
