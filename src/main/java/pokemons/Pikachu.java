package pokemons;

public class Pikachu extends Pokemon implements Evolvable{


    public  boolean canEvolve(){return true;}  // todo
    public Pokemon evolve(){
     return new Raichu();
    }

}
