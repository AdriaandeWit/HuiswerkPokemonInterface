import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    List<String> attacks = Arrays.asList("infero","pyroball", "firelash","flameThrower");
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
        int divdeWater = attackValuePyroBall/10*8;
        int divdeElectric = attackValuePyroBall/10*6;
        int divdeFire = attackValuePyroBall/10+6;
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with pyro ball");

        if (gymPokemon.getType().equals("Grass")) {
            System.out.println("is full affective on " + gymPokemon.getType());
            System.out.println(gymPokemon.getHp()+ "there go 80 HP off "+ attackValuePyroBall-gymPokemon.getHp() );
        }
        if (gymPokemon.getType().equals("Water")) {
            System.out.println(gymPokemon.getType() + "so that means that the attack is not full affective" + gymPokemon + "loses: ");
            System.out.println(gymPokemon.getHp()+ "there go 64 HP off "+ divdeWater-gymPokemon.getHp() );
        }
        if (gymPokemon.getType().equals("electric")) {


        } else {
        }
    }
    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        int attackValueFireLash = 50;
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with fire lash");
    }
        public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        int attackValueFlameThrower = 70;
        System.out.println(pokemon.getName() + "Attacks" + gymPokemon.getName() + "with flame thrower");
    }
    @Override
    public List<String> getAttacks() {
        return attacks;
    }

}
