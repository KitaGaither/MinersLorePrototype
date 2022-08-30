public class GameRules {
    public static void main(String[] args) {

        System.out.println("Miner's Lore Game" + "\n");

        String thePlayer;
        String thePlayer1;
        String thePlayer2;

        thePlayer = "-Player1: Gold Miner-Female";
        thePlayer1 = "-Player2: Gold Miner-Male";
        thePlayer2 = "-Player3: Gold Miner-Non-Binary";

        System.out.println("* Please choose one of the following players: " + "\n"  + "\n" + thePlayer + "\n" +  "\n" +
                thePlayer1 + "\n" + "\n" + thePlayer2 + "\n" + "\n");

        int yourHealth;
        int yourGold;
        int yourLives;

        yourHealth = 100;
        yourGold = 10;
        yourLives = 3;

        int gotAttackedHealth;
        gotAttackedHealth = yourHealth - 10;

        int gotAttackedGold;
        gotAttackedGold = yourGold - 2;

        int gotAttackedLives;
        gotAttackedLives = yourLives - 1;

        System.out.println("* Your starting stats are as follows: " + "\n" + "\n" + "-Your Health: " + yourHealth +
                "%" + "\n" + "\n" + "-Your Gold: $" + yourGold + "\n" +  "\n" +  "-Your Lives: " +  yourLives +
                "\n" + "\n");

        System.out.println("Each time you are attacked by a monster you lose 10 health points, 2 pieces of gold, " +
                "and 1 miner life." + "\n"
        );

        System.out.println("Getting attacked for the first time would leave you with " + gotAttackedLives +
                " lives remaining, " + gotAttackedGold + " pieces of gold, and your health would now be " +
                gotAttackedHealth + "%. Please tread lightly!");
    }
}
