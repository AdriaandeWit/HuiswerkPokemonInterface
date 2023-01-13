import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    List<String> attacks = Arrays.asList("infero","pyroball", "firelash","flameThrower");
    List<Integer> attacksValue = Arrays.
    public FirePokemon(String name, int level, int hp, String food, String sounds) {
        super(name , level , hp , food , sounds,"Fire");
    }

    public void inferno(Pokemon pokemon,Pokemon gymPokemon){
        int attackValueInferno = 60;

        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with inferno");
        }

    }
    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        int attackValuePyroBall = 80;
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with pyro ball");
        gymPokemon.getHp();
    }
    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        int attackValueFireLash = 50;
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with fire lash");
    }
        public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        int attackValueFlameThrower = 70;
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with flame thrower");
    }
    public int logicFire( ){



        if(gymPokemon.getType().equals("Grass")){
           attacks = pr
        }
        if (gymPokemon.getType().equals("Water")){
            avl
            System.out.println(gymPokemon.getType() + "so that means that the attack is not full affective" + gymPokemon + "loses: " );
        }
        if (gymPokemon.getType().equals("electric")){

        }
        else{

        }





    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }

}
