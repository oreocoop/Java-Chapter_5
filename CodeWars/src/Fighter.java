public class Fighter {
    public String name;
    public int health, damagePerAttack;



    // Construcvtor
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }




    public int getHealth() {
        return this.health;
    }
}