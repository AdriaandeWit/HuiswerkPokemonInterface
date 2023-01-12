
import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

List<String> attacks = Arrays.asList("surf"," hrdropump ", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int HP, String food, String sounds) {
        super(name , level , HP , food , sounds,"Water");
    }


    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with surf" );
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with hydropump");
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with hydrocanon");
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with raindance ");
    }
    public List<String> getAttacks() {
        return attacks;
    }
}
