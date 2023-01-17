import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("leafstrom ", "solarbeam", "leechseed", "leveblade");

    public GrassPokemon(String name, int level, int hp, String food, String sounds) {
        super(name, level, hp, food, sounds, "Grass");
    }

    public void grassAttacks(Pokemon pokemon, Pokemon gymPokemon) {
        int currentHp = gymPokemon.getHp();
        switch (gymPokemon.getType()) {
            case "grass" -> {
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "water" -> {
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "fire" -> {
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "electricfire" -> {
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

        }
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with leaf storm");
        grassAttacks(pokemon, gymPokemon);
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with solar beam ");
        grassAttacks(pokemon, gymPokemon);
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with leve blade");
        grassAttacks(pokemon, gymPokemon);
    }

    public List<String> leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        int currentHp = gymPokemon.getHp();
        int currentHpOwnPokemon = pokemon.getHp();

        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with leech seed");
        switch (gymPokemon.getType()) {
            case "grass" -> {
                System.out.println(gymPokemon.getName() + "loses 2 hp points and gives it to " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                pokemon.setHp(currentHpOwnPokemon + 2);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "water" -> {
                System.out.println(gymPokemon.getName() + "loses 4 hp points and gives it to " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                pokemon.setHp(currentHpOwnPokemon + 4);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "fire" -> {
                System.out.println(gymPokemon.getName() + "loses 8 hp points and gives it to " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                pokemon.setHp(currentHpOwnPokemon + 8);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "electric" -> {
                System.out.println(gymPokemon.getName() + "loses 12 hp points and gives it to " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                pokemon.setHp(currentHpOwnPokemon + 12);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
        }
        return null;
    }
    public List<String> getAttacks() {
        return attacks;
    }
}
