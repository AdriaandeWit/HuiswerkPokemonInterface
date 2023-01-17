import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    List<String> attacks = Arrays.asList("infero","pyroball", "firelash","flameThrower");
    public FirePokemon(String name, int level, int hp, String food, String sounds) {
        super(name , level , hp , food , sounds,"Fire");
    }
private void fireAttack(Pokemon pokemon,Pokemon gymPokemon){
    switch (gymPokemon.getType()) {
        case "Fire" -> {
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
            gymPokemon.setHp(currentHp - 2);
            System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
            System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            break;
        }
        case "electric" -> {
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
            gymPokemon.setHp(currentHp - 4);
            System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
            System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            break;
        }
        case "water" -> {
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
            gymPokemon.setHp(currentHp - 8);
            System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
            System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            break;
        }
        case "grass" -> {
            int currentHp = gymPokemon.getHp();
            System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
            gymPokemon.setHp(currentHp - 12);
            System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
            System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
            break;
        }
    }
}

    public void inferno(Pokemon pokemon,Pokemon gymPokemon){
        System.out.println(pokemon.getName() + "attacks" + gymPokemon.getName() + "with inferno");
        fireAttack(pokemon,gymPokemon);
    }
    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "attacks" + gymPokemon.getName() + "with pyro ball");
        fireAttack(pokemon,gymPokemon);
    }
    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "attacks" + gymPokemon.getName() + "with fire lash");
        fireAttack(pokemon,gymPokemon);
    }
        public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "attacks" + gymPokemon.getName() + "with flame thrower");
        fireAttack(pokemon,gymPokemon);
    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }

}
