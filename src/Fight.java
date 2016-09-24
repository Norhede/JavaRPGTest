/**
 * Created by Henrik on 24-09-2016.
 */
public class Fight {

    private String playerName;
    private int playerMeleeAttack;
    private int playerMeleeDefense;
    private int playerRangedAttack;
    private int playerRangedDefense;
    private int playerMagicAttack;
    private int playerMagicDefense;
    private int playerHealthPoints;
    private int playerAttackSpeed;

    private String monsterName;
    private int monsterAttackType;
    private int monsterMeleeAttack;
    private int monsterMeleeDefense;
    private int monsterRangedAttack;
    private int monsterRangedDefense;
    private int monsterMagicAttack;
    private int monsterMagicDefense;
    private int monsterHealthPoints;
    private int monsterAttackSpeed;

    private boolean playersTurn;
    private boolean playerDead;
    private boolean monsterDead;

    public void fightMonster(Player p, Monster m) throws InterruptedException {
        setStats(p, m);
        checkForInitiative(p, m);

        while (playerDead == false && monsterDead == false) {
            if (playersTurn) {
                playerMeleeAttacksMonster(p, m);
                checkForMonsterDeath();
                if(monsterDead) {
                    playersWins(p, m);
                    break;
                }
            }
            else {
                checkForMonsterAttackType(m);
                if (monsterAttackType == 1)
                    monsterMeleeAttacksPlayer(p, m);
                else if (monsterAttackType == 2)
                    monsterRangedAttacksPlayer(p, m);
                else
                    monsterMagicAttacksPlayer(p, m);

                checkForPlayerDeath();
                if(playerDead) {
                    monsterWins();
                    break;
                }
            }
            Thread.sleep(300);
        }

        /*
        Imens ingen er døde

        Den der har initiativet angriber
         */
    }

    public void setStats(Player p, Monster m) {
        // Set player stats
        playerName = p.getPlayerName();
        playerMeleeAttack = p.getMeleeAttack();
        playerMeleeDefense = p.getMeleeDefense();
        playerRangedAttack = p.getRangedAttack();
        playerRangedDefense = p.getRangedDefense();
        playerMagicAttack = p.getMagicAttack();
        playerMagicDefense = p.getMagicDefense();
        playerHealthPoints = p.getHealthPoints();
        playerDead = false;

        // Set monster stats
        monsterName = m.getMonsterName();
        monsterMeleeAttack = m.getMeleeAttack();
        monsterMeleeDefense = m.getMeleeDefense();
        monsterRangedAttack = m.getRangedAttack();
        monsterRangedDefense = m.getRangedDefense();
        monsterMagicAttack = m.getMagicAttack();
        monsterMagicDefense = m.getMagicDefense();
        monsterHealthPoints = m.getHealthPoints();
        monsterDead = false;
    }

    public void checkForInitiative(Player p, Monster m) {
        playerAttackSpeed = p.getAttackSpeed();
        monsterAttackSpeed = m.getAttackSpeed();

        if(playerAttackSpeed > monsterAttackSpeed)
            playersTurn = true;
        else
            playersTurn = false;
    }

    public void checkForMonsterAttackType(Monster m) {
        int attackRoll = ChanceRolls.rollNumber(1, 100);
        if (attackRoll > 100-m.getChanceToMeleeAttack())
            monsterAttackType = 1;
        else if (attackRoll > 100-m.getChanceToMeleeAttack()-m.getChanceToRangedAttack())
            monsterAttackType = 2;
        else
            monsterAttackType = 3;
    }

    public void playerMeleeAttacksMonster(Player p, Monster m) {
        if (monsterMeleeDefense >= playerMeleeAttack)
            System.out.println(playerName + " tries to hit " + monsterName + " with a melee attack, but it's too weak! " + monsterName + " has " + monsterHealthPoints + "/" + m.getHealthPoints() + " health left!");
        else {
            monsterHealthPoints -= (playerMeleeAttack-monsterMeleeDefense);
            System.out.println(playerName + " hits " + monsterName + " for " + (playerMeleeAttack-monsterMeleeDefense) + " damage with a melee attack! " + monsterName + " has " + monsterHealthPoints + "/" + m.getHealthPoints() + " health left!");

        }
        playersTurn = false;
    }

    public void monsterMeleeAttacksPlayer(Player p, Monster m) {
        if(playerMeleeDefense >= monsterMeleeAttack)
            System.out.println(monsterName + " tries to hit " + playerName + " with a melee attack, but it's too weak! " + playerName + " has " + playerHealthPoints + "/" + p.getHealthPoints() + " health left!");
        else {
            playerHealthPoints -= (monsterMeleeAttack-playerMeleeDefense);
            System.out.println(monsterName + " hits " + playerName + " for " + (monsterMeleeAttack-playerMeleeDefense) + " damage with a melee attack! " + playerName + " has " + playerHealthPoints + "/" + p.getHealthPoints() + " health left!");
        }
        playersTurn = true;
    }

    public void monsterRangedAttacksPlayer(Player p, Monster m) {
        if(playerRangedDefense >= monsterRangedAttack)
            System.out.println(monsterName + " tries to hit " + playerName + " with a ranged attack, but it's too weak! " + playerName + " has " + playerHealthPoints + "/" + p.getHealthPoints() + " health left!");
        else {
            playerHealthPoints -= (monsterRangedAttack-playerRangedDefense);
            System.out.println(monsterName + " hits " + playerName + " for " + (monsterRangedAttack-playerRangedDefense) + " damage with a ranged attack! " + playerName + " has " + playerHealthPoints + "/" + p.getHealthPoints() + " health left!");
        }
        playersTurn = true;
    }

    public void monsterMagicAttacksPlayer(Player p, Monster m) {
        if(playerMagicDefense >= monsterMagicAttack)
            System.out.println(monsterName + " tries to hit " + playerName + " with a magic attack, but it's too weak! " + playerName + " has " + playerHealthPoints + "/" + p.getHealthPoints() + " health left!");
        else {
            playerHealthPoints -= (monsterMagicAttack-playerMagicDefense);
            System.out.println(monsterName + " hits " + playerName + " for " + (monsterMagicAttack-playerMagicDefense) + " damage with a magic attack! " + playerName + " has " + playerHealthPoints + "/" + p.getHealthPoints() + " health left!");
        }
        playersTurn = true;
    }

    public boolean checkForMonsterDeath() {
        if (monsterHealthPoints <= 0)
            monsterDead = true;
        return monsterDead;
    }

    public boolean checkForPlayerDeath() {
        if (playerHealthPoints <= 0)
            playerDead = true;
        return playerDead;
    }

    public void playersWins(Player p, Monster m) {
        System.out.println("The " + monsterName + " is dead! You get " + m.getGoldDrop() + " gold and " + m.getExpDrop() + " experience points!");
        p.setCurrentExperiencePoints(p.getCurrentExperiencePoints() + m.getExpDrop());
        p.setPlayerGold(p.getPlayerGold() + m.getGoldDrop());
    }

    public void monsterWins() {
        System.out.println("The " + monsterName + "beat you! Try to become stronger, and then try again!");
    }

    static Fight arena = new Fight();

}
