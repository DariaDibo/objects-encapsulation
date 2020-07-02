import java.util.Random;

public class EncapsulationSimpleApp {

    public static void main(String[] args) {

        Player myCharacter = new Player("Dorix");
        Player enemyCharacter = new Player("     ");

        enemyCharacter.setName("");
        myCharacter.setHp(1000);

        System.out.println( myCharacter.getName() );
        System.out.println( myCharacter.getHp() );
        System.out.println( myCharacter.getScore() );
        System.out.println( myCharacter.isAlive() );

        System.out.println();
        System.out.println( enemyCharacter.getName() );

    }
}

class Player {

    private String  name;
    private int     score;
    private int     hp;
    private boolean alive;

    Player (String name) {
        setName(name);
        setHp(100);
        setScore(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        String strName = new String(name);

        if ( name.trim().equals("") ) {

            Random r = new Random();
            int randomNumber = r.nextInt(100000000);
            String filledRandNum = String.format("%09d", randomNumber);

            this.name = "player_" + filledRandNum;

        } else if ( strName.length() >=3 && strName.length() <= 15 ) {

            this.name = name;

        }

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 10000) {
            this.score = score;
        }

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp >= 0 && hp <= 100) {
            this.hp = hp;
        } else if (hp == 0) {
            setAlive(false);
        }

    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
