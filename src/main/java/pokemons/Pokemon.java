package pokemons;


import java.util.HashMap;


public abstract class Pokemon {

    protected int level;
    protected int totalExp;
    protected HashMap<Byte, Move> moveList = new HashMap<Byte, Move>();

    public int getTotalExp() {
        return this.totalExp;
    }

    public void addExp (int receivedExp){
        this.totalExp+=receivedExp;
        level = ExperienceCalculator.getLevel(this);
    }


    public void getMoveList() {
        for (Move value : this.moveList.values()) {
            System.out.println(value.getMoveName());
        }
    }


    protected class PokedexData {
        public PokemonType type;
        public float height;
        public float weight;

        PokedexData(PokemonType type, float height, float weight) {
            setPokedexData(type, height, weight);
        }

        void setPokedexData(PokemonType type, float height, float weight) {
            this.type = type;
            this.height = height;
            this.weight = weight;
        }

        public PokemonType getPokemonType() {
            return this.type;
        }

    }

    protected class BaseStats {
        public byte index;
        public int hp;
        public int atk;
        public int speed;

        BaseStats(byte index, int hp, int atk, int speed) {

            setBaseStats(index, hp, atk, speed);
        }

        void setBaseStats(byte index, int hp, int atk, int speed) {
            this.index = index;
            this.hp = hp;
            this.atk = atk;
            this.speed = speed;
        }

        public int getAttack() {
            return this.atk;
        }

        public int getHp() {
            return this.hp;
        }

        public int getSpeed() {
            return this.speed;
        }
    }

}