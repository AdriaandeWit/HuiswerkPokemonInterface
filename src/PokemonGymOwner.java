import java.util.List;

public class PokemonGymOwner extends PokemonTrainer{

    private String Town;

    public PokemonGymOwner(String name, String Town, List<Pokemon> pokemons){
        super(name, pokemons);
        this.Town = Town;


    }

    public String getTown() {
    }
}