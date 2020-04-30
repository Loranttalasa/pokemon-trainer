package pokemons;

public interface Evolvable {

    boolean canEvolve(); //check if NOT in team and reached MAX lvl
    Pokemon evolve();

}
