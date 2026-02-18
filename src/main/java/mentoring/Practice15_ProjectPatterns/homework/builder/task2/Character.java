package mentoring.Practice15_ProjectPatterns.homework.builder.task2;

public class Character {
    private String health;
    private String damage;
    private String armor;
    private String magic;

    public Character(String health, String damage, String armor, String magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    public Character(Builder builder) {
        this.health = builder.health;
        this.damage = builder.damage;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    @Override
    public String toString() {
        return "Character " +
                "health -> " + health +
                ", damage -> " + damage +
                ", armor -> " + armor +
                ", magic " + magic;
    }

    static class Builder {
        private String health;
        private String damage;
        private String armor;
        private String magic;

        public Builder setHealth(String health) {
            this.health = health;
            return this;
        }

        public Builder setDamage(String damage) {
            this.damage = damage;
            return this;
        }

        public Builder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public Builder setMagic(String magic) {
            this.magic = magic;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}