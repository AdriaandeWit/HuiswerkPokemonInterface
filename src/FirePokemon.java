import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    List<String> attacks = Arrays.asList("infero","pyroball", "firelash","flameThrower");
    public FirePokemon(String name, int level, int hp, String food, String sounds) {
        super(name , level , hp , food , sounds,"Fire");
    }

    public void inferno(Pokemon pokemon,Pokemon gymPokemon){
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with inferno");
    }
    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with pyroball");
    }
    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with firelash");
    }
        public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with flamethrower");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }
}
