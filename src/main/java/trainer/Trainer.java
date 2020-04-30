package trainer;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trainer {


    class PersonalData {
        public String name;
        private Gender gender;
        private int age; //girls stuff yknow))
        public byte trainerRank; // Trainer Rank is a ranking system with rewards based on the number of Pokémon caught by the Trainer
        private int cash = 1000;

        void setName(Scanner in) {
            try {
                String input = in.nextLine();
                validateName(input);
                this.name = input;
            } catch (InvalidPersonalData exception) {
                this.name = "Ololosh";
            }
        }

        private void validateName(String enteredName) throws InvalidPersonalData {
                Pattern pattern = Pattern.compile("^[ A-Za-z]+$");
                Matcher m = pattern.matcher(enteredName);
                if (!m.matches()) {
                    throw new InvalidPersonalData("You provided wrong data");
                }
            }
    }


    PokemonCollection collection = new PokemonCollection();

}
