import java.util.List;

public class PokemonTrainer {
//8 variabele, 1 constructor, getters en setters.

    private String name;

    private List<Pokemon> pokemons;





    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;

    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
//Getters
    public String getName() {
        return name;
    }
    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
