import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("thunderpunch","electroball", "thunder", "volttackle" );
    public ElectricPokemon(String name, int level ,int hp , String food, String sound) {
        super(name, hp, level, food, sound,  "Electric");
    }



    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with thunder punch");
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with electro ball");
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with thunder");
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with volt tackele");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }
}
