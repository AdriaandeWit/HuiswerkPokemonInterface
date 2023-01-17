
import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

List<String> attacks = Arrays.asList("surf"," hrdropump ", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int HP, String food, String sounds) {
        super(name , level , HP , food , sounds,"Water");
    }

    public void waterAttacks(Pokemon pokemon,Pokemon gymPokemon ){
        int currentHp = gymPokemon.getHp();
        switch (gymPokemon.getType()){
            case "water" -> {
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "grass" -> {
                System.out.println(gymPokemon.getName() + " loses 4 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "electric" -> {
                System.out.println(gymPokemon.getName() + " loses 8 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "fire" -> {
                System.out.println(gymPokemon.getName() + " loses 12 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

        }
    }


    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with surf" );
        waterAttacks(pokemon, gymPokemon);
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with hydropump");
        waterAttacks(pokemon, gymPokemon);

    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with hydrocanon");
        waterAttacks(pokemon, gymPokemon);
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        int currentHp = gymPokemon.getHp();
        int currentHpOwnPokemon = pokemon.getHp();
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with raindance ");
        switch (gymPokemon.getType()) {
            case "water" -> {
                System.out.println(gymPokemon.getName() + "loses 2 points");
                gymPokemon.setHp(currentHp - 2);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "grass" -> {
                System.out.println(gymPokemon.getName() + "is a grass type so that has a positve effect on the type");
                        gymPokemon.setHp(currentHp + 4);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "electric" -> {
                System.out.println(gymPokemon.getName() + "is a electric type, so the attack has no effect");
                gymPokemon.setHp(currentHp);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "fire" -> {
                System.out.println(gymPokemon.getName() + "loses 12 points");
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
        }
    }
    public List<String> getAttacks() {
        return attacks;
    }
}
