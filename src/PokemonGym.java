import java.util.List;

public interface PokemonGym {

   Pokemon chooseGymPokemon(PokemonGymOwner gymOwner);
   void printPokemon(List<Pokemon> pokemons);
   void enteredTheGym(PokemonTrainer player1);
   void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack);
    Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);
    void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);
     Pokemon choosePokemon(PokemonTrainer trainer);
    int randomAttackByGymOwner();
    String chooseAttackPlayer(Pokemon p);
    void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon);
    void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym);



}
