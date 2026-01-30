public class Character {
    private int health;
    private int stamina;

    private int maxHealth = 100;
    private int maxStamina = 50;

    public Character() {
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public void swingSword() {
        this.stamina -= 10;
        System.out.println("Character swings the sword. Stamina is now " + this.stamina + ".");
        if (this.stamina <= 0) {
            this.stamina = 0;
            System.out.println("Your character needs to cool down.");
        }
    }

    public void takeDamage(int damageAmount) {
        this.health -= damageAmount;
        System.out.println("Character takes " + damageAmount + " damage. Health is now " + this.health + ".");
        if (this.health <= 0) {
            this.health = 0;
            System.out.println("Character is dead.");
        }
    }

    public void rest() {
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }

    public void showDetails() {
        System.out.println("Character's health: " + this.health + ", stamina: " + this.stamina + ".");
    }
}