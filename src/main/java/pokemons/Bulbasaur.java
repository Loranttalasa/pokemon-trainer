package pokemons;

public class Bulbasaur extends Pokemon implements Evolvable{

    private String name ="Bulbasaur";

    public String getName() {
        return this.name;
    }

    public boolean canEvolve(){
        return true; //implement proper calculation based on current exp and team Status later
    }

    public Pokemon evolve(){
        return new Ivysaur();
    }

}
