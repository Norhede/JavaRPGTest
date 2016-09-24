import java.util.ArrayList;

/**
 * Created by Henrik on 24-09-2016.
 */
public class Monster {

    private static ArrayList<Monster> monsters = new ArrayList<Monster>();

        // Monster variables

    private String monsterName;
    private int monsterLevel;
    private int goldDrop;
    private int expDrop;

        // Monster stats

        // Melee
    private int meleeAttack;            // Fortitude: Melee Attack
    private int meleeDefense;           // Toughness: Melee Defense
    private int chanceToMeleeAttack;    // %-based chance for a Melee Attack

        // Ranged
    private int rangedAttack;           // Finesse: Ranged Attack
    private int rangedDefense;          // Quickness: Ranged Defense
    private int chanceToRangedAttack;   // %-based chance for a Ranged Attack

        // Magic
    private int magicAttack;            // Intellect: Magic Attack
    private int magicDefense;           // Determination: Magic Defense
    private int chanceToMagicAttack;    // %-based chance for a Magic Attack

        // Other
    private int healthPoints;           // Resilience: Health Points
    private int attackSpeed;            // Initiative: Attack Speed

        // Get- and set-methods

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getMonsterLevel() {
        return monsterLevel;
    }

    public void setMonsterLevel(int monsterLevel) {
        this.monsterLevel = monsterLevel;
    }

    public int getGoldDrop() {
        return goldDrop;
    }

    public void setGoldDrop(int goldDrop) {
        this.goldDrop = goldDrop;
    }

    public int getExpDrop() {
        return expDrop;
    }

    public void setExpDrop(int expDrop) {
        this.expDrop = expDrop;
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

    public int getChanceToMeleeAttack() {
        return chanceToMeleeAttack;
    }

    public void setChanceToMeleeAttack(int chanceToMeleeAttack) {
        this.chanceToMeleeAttack = chanceToMeleeAttack;
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

    public int getChanceToRangedAttack() {
        return chanceToRangedAttack;
    }

    public void setChanceToRangedAttack(int chanceToRangedAttack) {
        this.chanceToRangedAttack = chanceToRangedAttack;
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

    public int getChanceToMagicAttack() {
        return chanceToMagicAttack;
    }

    public void setChanceToMagicAttack(int chanceToMagicAttack) {
        this.chanceToMagicAttack = chanceToMagicAttack;
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

    public Monster() {

    }

    public Monster(String monsterName) {
        this.monsterName = monsterName;
        monsterLevel = 1;
        goldDrop = 5;
        expDrop = 3;

        // Monster stats
        meleeAttack = 3;
        meleeDefense = 2;
        chanceToMeleeAttack = 0;
        rangedAttack = 3;
        rangedDefense = 2;
        chanceToRangedAttack = 0;
        magicAttack = 3;
        magicDefense = 2;
        chanceToMagicAttack = 100;
        healthPoints = 10;
        attackSpeed = 1;
    }

    public Monster(String monsterName, int monsterLevel, int goldDrop, int expDrop, int meleeAttack, int meleeDefense, int chanceToMeleeAttack, int rangedAttack, int rangedDefense, int chanceToRangedAttack, int magicAttack, int magicDefense, int chanceToMagicAttack, int healthPoints, int attackSpeed) {
        this.monsterName = monsterName;
        this.monsterLevel = monsterLevel;
        this.goldDrop = goldDrop;
        this.expDrop = expDrop;
        this.meleeAttack = meleeAttack;
        this.meleeDefense = meleeDefense;
        this.chanceToMeleeAttack = chanceToMeleeAttack;
        this.rangedAttack = rangedAttack;
        this.rangedDefense = rangedDefense;
        this.chanceToRangedAttack = chanceToRangedAttack;
        this.magicAttack = magicAttack;
        this.magicDefense = magicDefense;
        this.chanceToMagicAttack = chanceToMagicAttack;
        this.healthPoints = healthPoints;
        this.attackSpeed = attackSpeed;
    }

    static Monster testMonster = new Monster("Rat");

}
