public class Mage extends Character {
    private int mana;

    protected Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    public void castSpell(Character target) {

    }

    public void heal(Character target) {

    }

    public int getMana() {
        return 0;
    }
}
