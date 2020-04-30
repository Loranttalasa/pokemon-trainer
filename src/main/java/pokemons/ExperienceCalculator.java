package pokemons;
import java.util.List;
import java.util.Arrays;



public class ExperienceCalculator {
    static List<Integer> expPerLevel= Arrays.asList(0,10,20,40,80,160,320,640,1280,2560);// 10 exp to level 2, 20 exp to level 3 etc
    static int max_level=expPerLevel.size()+1;

    static int getLevel(Pokemon pokemon){
        int currentExp = pokemon.getTotalExp();
        if (currentExp<=10){return 1;}

        for(int i=0;i<expPerLevel.size();i++){
            if(currentExp<=expPerLevel.get(i)){
                return i+1;
            }
        }
        return max_level;
    }

    static int expToNextLevel(Pokemon pokemon) {
        int currentExp =pokemon.getTotalExp();
        if (currentExp < 10) {
            return expPerLevel.get(1) - currentExp;
        } else if (expPerLevel.contains(currentExp)) { return 1; } //corner case, 1 exp is required to level up
        else {
            for (int i = 0; i < expPerLevel.size(); i++) {
                if (currentExp < expPerLevel.get(i)) {
                    return expPerLevel.get(i) - currentExp;
                }
            }
            return 0; // if exp is for some reason >2500
        }

        }

    }



