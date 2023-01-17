import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("thunderpunch","electroball", "thunder", "volttackle" );
    public ElectricPokemon(String name, int level ,int hp , String food, String sound) {
        super(name, hp, level, food, sound,  "Electric");
    }
    public void electricAttacks(Pokemon pokemon, Pokemon gymPokemon ){
        int currentHp = gymPokemon.getHp();
        switch (gymPokemon.getType()){
            case "electric" -> {
                System.out.println(gymPokemon.getName() + " loses 2 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 2);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "fire" -> {
                System.out.println(gymPokemon.getName() + " loses 4 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 4);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "grass" -> {
                System.out.println(gymPokemon.getName() + " loses 8 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 8);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }
            case "water" -> {
                System.out.println(gymPokemon.getName() + " loses 12 hp in its attack with " + pokemon.getName());
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + " has now " + gymPokemon.getHp() + " hp");
                System.out.println(pokemon.getName() + " has now " + pokemon.getHp() + " hp");
                break;
            }

        }
    }



    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with thunder punch");
        electricAttacks(pokemon, gymPokemon);
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with electro ball");
        electricAttacks(pokemon, gymPokemon);
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        int currentHp = gymPokemon.getHp();
        int currentHpOwnPokemon = pokemon.getHp();

        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with thunder");
        electricAttacks(pokemon, gymPokemon);
        switch (gymPokemon.getType()) {
            case "electric" -> {
                System.out.println(gymPokemon.getName() + "Thunder has a positve effect on electric pokemon.");
                gymPokemon.setHp(currentHp + 4);
                pokemon.setHp(currentHpOwnPokemon + 4);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "fire"-> {
                System.out.println(gymPokemon.getName() + "loses 4 points");
                gymPokemon.setHp(currentHp - 4);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "grass"-> {
                System.out.println(gymPokemon.getName() + "loses 8 points");
                gymPokemon.setHp(currentHp - 8);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;
            }
            case "water"-> {
                System.out.println(gymPokemon.getName() + "loses 12 points");
                gymPokemon.setHp(currentHp - 12);
                System.out.println(gymPokemon.getName() + "has now " + gymPokemon.getHp() + "Hp");
                System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "Hp");
                break;

            }
        }
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with volt tackele");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }
}
