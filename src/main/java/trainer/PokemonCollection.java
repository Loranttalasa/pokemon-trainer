package trainer;

import pokemons.Pokemon;
import java.util.ArrayList;


public class PokemonCollection {
    private ArrayList<Pokemon> collection = new ArrayList<Pokemon>();

    public ArrayList<Pokemon> getCollection() {
        return collection;
    }

    public void  addToCollection(Pokemon pokemon){
        collection.add(pokemon);
    }
    public boolean isCaught(Pokemon pokemon){
        return collection.contains(pokemon);
    }

    /*public int pokemonCount(Pokemon pokemon){
    //todo
    }
    */
    public int totalCollected(){
        return collection.size();
    }


}
