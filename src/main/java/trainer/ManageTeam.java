package trainer;
import pokemons.Pokemon;
import java.util.ArrayList;

public class ManageTeam {
    public static final int SIZE = 3;
    private ArrayList<Pokemon> team = new ArrayList<Pokemon>();


    public void setTeam(Pokemon[] pokemon) {
        int i = 0;
        while (i < SIZE) {
            this.team.add(pokemon[i]);
        }
    }

    public ArrayList<Pokemon> getTeam() {
        return this.team;
    }

    public void removeFromTeam(Pokemon pokemon){
        this.team.remove(pokemon);
    }

    public void addToTeam(Pokemon pokemon){
        if (this.team.size()<SIZE){
            this.team.add(pokemon);
        }
    else { System.out.println("Team is full, you have to remove someone before adding new member");
    }

    }
}
