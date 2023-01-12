import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("leafstrom ","solarbeam", "leechseed","leveblade");
    public GrassPokemon(String name, int level, int hp, String food, String sounds) {
        super(name, level , hp , food , sounds , "Grass");
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with leaf storm");
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with solar beam ");
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with leech seed");
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with leve blade");
    }
    public List<String> getAttacks(){
        return attacks;
    }
}
