/**
 * Created by Henrik on 24-09-2016.
 */
public class Player {

        // Lists

    static int[] expTable = new int[] { 100, 200, 300 };

        // Player variables

    private String playerName;
    private int playerLevel;
    private int currentExperiencePoints;
    private int experiencePointsForNextLevel;
    private int playerGold;

        // Player stats

    private int meleeAttack;            // Fortitude: Melee Attack
    private int meleeDefense;           // Toughness: Melee Defense
    private int rangedAttack;           // Finesse: Ranged Attack
    private int rangedDefense;          // Quickness: Ranged Defense
    private int magicAttack;            // Intellect: Magic Attack
    private int magicDefense;           // Determination: Magic Defense
    private int healthPoints;           // Resilience: Health Points
    private int attackSpeed;            // Initiative: Attack Speed

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    public int getCurrentExperiencePoints() {
        return currentExperiencePoints;
    }

    public void setCurrentExperiencePoints(int currentExperiencePoints) {
        this.currentExperiencePoints = currentExperiencePoints;
    }

    public int getExperiencePointsForNextLevel() {
        return experiencePointsForNextLevel;
    }

    public void setExperiencePointsForNextLevel(int experiencePointsForNextLevel) {
        this.experiencePointsForNextLevel = experiencePointsForNextLevel;
    }

    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public int getMeleeAttack() {
        return meleeAttack;
    }

    public void setMeleeAttack(int meleeAttack) {
        this.meleeAttack = meleeAttack;
    }

    public int getMeleeDefense() {
        return meleeDefense;
    }

    public void setMeleeDefense(int meleeDefense) {
        this.meleeDefense = meleeDefense;
    }

    public int getRangedAttack() {
        return rangedAttack;
    }

    public void setRangedAttack(int rangedAttack) {
        this.rangedAttack = rangedAttack;
    }

    public int getRangedDefense() {
        return rangedDefense;
    }

    public void setRangedDefense(int rangedDefense) {
        this.rangedDefense = rangedDefense;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Player() {
            // Player variables
        playerName = "Henrik";
        playerLevel = 1;
        currentExperiencePoints = 0;
        experiencePointsForNextLevel = expTable[playerLevel-1];
        playerGold = 0;

            // Player stats
        meleeAttack = 3;
        meleeDefense = 3;
        rangedAttack = 3;
        rangedDefense = 2;
        magicAttack = 3;
        magicDefense = 2;
        healthPoints = 15;
        attackSpeed = 5;
    }

    static Player testPlayer = new Player();
}
