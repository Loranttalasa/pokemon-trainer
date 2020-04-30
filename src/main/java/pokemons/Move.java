package pokemons;

public class Move {
    String moveName;
    PokemonType moveType;
    int power;
    Move(String moveName, PokemonType moveType, int power){
        setMoveName(moveName,moveType, power);
    }

    public void setMoveName(String moveName,PokemonType moveType, int power) {
        this.moveName = moveName;
        this.moveType =moveType;
        this.power=power;

    }

    PokemonType getMoveType(){
        return this.moveType;
    }
    public String  getMoveName(){
        return this.moveName;
    }
}
